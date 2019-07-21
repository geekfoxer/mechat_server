package com.glozz.mechat.server.utils

import java.time.format.DateTimeFormatter
import java.time.{LocalDate, LocalDateTime}

import com.alibaba.fastjson.JSONObject
import com.fasterxml.jackson.core.`type`.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.datatype.jsr310.deser.{LocalDateDeserializer, LocalDateTimeDeserializer}
import com.fasterxml.jackson.datatype.jsr310.ser.{LocalDateSerializer, LocalDateTimeSerializer}
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.module.scala.experimental.ScalaObjectMapper

import scala.collection.JavaConverters._
import scala.language.implicitConversions

/**
  *
  * Create by zhuji on 2019-07-04
  */
object JSONUtil {
  lazy val mapper: ObjectMapper with ScalaObjectMapper = {
    val mapper = new ObjectMapper() with ScalaObjectMapper
    mapper.registerModule(new DefaultScalaModule())
      .registerModule(new Jdk8Module)
      .registerModule(new JavaTimeModule()
        .addDeserializer(classOf[LocalDateTime], new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
        .addDeserializer(classOf[LocalDate], new LocalDateDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd")))
        .addSerializer(classOf[LocalDateTime], new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
        .addSerializer(classOf[LocalDate], new LocalDateSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd"))))
    mapper
  }

  implicit def customString(v: Any): CustomJson = new CustomJson {
    override val value: Any = v
  }

  trait CustomJson {
    val value: Any

    /**
      * convert to json string with jackson
      */
    def toJsonString: String = value match {
      case s: String => s
      case _ => mapper.writeValueAsString(value)
    }

    /**
      * convert json string to any object
      */
    def parseObject[T](typeReference: TypeReference[T]): T = mapper.readValue(value.toJsonString, typeReference)

    /**
      * 驼峰转下划线
      */
    implicit def humpToUnderLine: String = value match {
      case str: String => str.map(c => if (c.isUpper) "_" + c.toLower else c).mkString
      case _ => throw new RuntimeException("humpToUnderLine just support string")
    }

    /**
      * 下划线转驼峰
      */
    implicit def underlineToHump: String = value match {
      case str: String => {
        var target = 0
        for ((c, index) <- str.zipWithIndex) yield {
          if (c == '_') {
            target = index + 1
            ""
          } else {
            if (index == target && index != 0) c.toUpper else c
          }
        }
      }.mkString
      case _ => throw new RuntimeException("underlineToHump just support string")
    }
  }

  //---------
  //for java
  //---------
  def toJsonString(value: AnyRef): String = value.toJsonString

  def parseObject[T](value: AnyRef, typeReference: TypeReference[T]): T = value.parseObject(typeReference)

  def main(args: Array[String]): Unit = {
    val jsonObject: JSONObject = new JSONObject().fluentPut("a", 12).fluentPut("b", Map("c" -> "hueygfu"))
    val tuples = jsonObject.entrySet().asScala.map(e => (e.getKey.humpToUnderLine, e.getValue)).toMap
    println(tuples.toJsonString)
    //    println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
    //    println(Map("a" -> 1).toJsonString.parseObject(new TypeReference[Map[String, _]] {}))
    //    println(LocalDateTime.now())
    println(LocalDateTime.now().toJsonString.parseObject(new TypeReference[LocalDateTime] {}))
    println("aaa".toJsonString)
    //    println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME))
  }
}
