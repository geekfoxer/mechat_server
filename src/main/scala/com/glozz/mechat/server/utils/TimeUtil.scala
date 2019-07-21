package com.glozz.mechat.server.utils

import java.time._
import java.time.format.DateTimeFormatter
import java.time.temporal.{ChronoUnit, TemporalUnit}
import java.util.Date

import com.glozz.mechat.server.utils.JSONUtil._

import scala.language.implicitConversions

object TimeUtil {

  implicit def customTime(value: Any): CustomTime = value match {
    case _: String | _: Long | _: LocalDate | _: LocalDateTime | _: Date => new CustomTime {
      override val time: Any = value
    }
    case _ => throw new UnsupportedOperationException("just support String | Long | LocalDate | LocalDateTime | Date")
  }

  trait CustomTime {
    val time: Any

    def toLocalDate(format: String = DEFAULT_TIME_FORMAT_STRING): LocalDate = time match {
      case s: String => LocalDate.parse(s, DateTimeFormatter.ofPattern(format))
      case l: Long => Instant.ofEpochMilli(l).atZone(ZoneId.systemDefault).toLocalDate
      case d: Date => d.toInstant.atZone(ZoneId.systemDefault()).toLocalDate;
      case t: LocalDateTime => t.toLocalDate
      case _ => throw new UnsupportedOperationException("toLocalDate just support String | Long | Date | LocalDateTime")
    }

    def toLocalDateTime(format: String = DEFAULT_TIME_FORMAT_STRING): LocalDateTime = time match {
      case s: String => LocalDateTime.parse(s, DateTimeFormatter.ofPattern(format))
      case l: Long => Instant.ofEpochMilli(l).atZone(ZoneId.systemDefault).toLocalDateTime
      case d: Date => d.toInstant.atZone(ZoneId.systemDefault()).toLocalDateTime;
      case t: LocalDate => LocalDateTime.of(t, LocalTime.ofNanoOfDay(0))
      case _ => throw new UnsupportedOperationException("toLocalDateTime just support String | Long | Date | LocalDate")
    }

    def customPlusFormat(format: String = DEFAULT_TIME_FORMAT_STRING,
                         plus: Long = 0,
                         unit: TemporalUnit = ChronoUnit.DAYS): String = time match {
      case t: LocalDate => t.toLocalDateTime(format).plus(plus, unit).format(format)
      case t: LocalDateTime => t.plus(plus, unit).format(format)
      case d: Date => d.toLocalDateTime(format).plus(plus, unit).format(format)
      case s: String => {
        if (format.matches("(.*)[HHmmss]")) {
          s.toLocalDateTime(format).plus(plus, unit).format(format)
        } else {
          s.toLocalDate(format).plus(plus, unit).format(format)
        }
      }
      case l: Long => l.toLocalDateTime(format).plus(plus, unit).format(format)
    }
  }

  //--------
  //for java
  //--------
  def toLocalDate(time: Any, format: String = DEFAULT_TIME_FORMAT_STRING): LocalDate = time.toLocalDate(format)

  def toLocalDateTime(time: Any, format: String = DEFAULT_TIME_FORMAT_STRING): LocalDateTime = time.toLocalDateTime(format)

  def customPlusFormat(time: Any,
                       format: String = DEFAULT_TIME_FORMAT_STRING,
                       plus: Long = 0,
                       unit: TemporalUnit = ChronoUnit.DAYS): String = time.customPlusFormat(format, plus, unit)

  //----------
  //formatters
  //----------
  val DEFAULT_TIME_FORMAT_STRING = "yyyy-MM-dd HH:mm:ss"
  val DT_FORMAT_STRING = "yyyyMMdd"

  implicit def string2formatter(format: String): DateTimeFormatter = DateTimeFormatter.ofPattern(format)

  def main(args: Array[String]): Unit = {
    println(LocalDateTime.of(LocalDate.now(), LocalTime.ofNanoOfDay(0)).format(DEFAULT_TIME_FORMAT_STRING))
    println(LocalDateTime.now().customPlusFormat(plus = -1).customPlusFormat(plus = 2))
    //    println(LocalDateTime.now().customPlusFormat(plus = -1).toLocalDate())
    //    println(LocalDate.now().customPlusFormat(plus = -1).toLocalDateTime())
    println(LocalDate.now().customPlusFormat(plus = -1).toLocalDateTime().toJsonString)
    //    println(LocalDate.now().customPlusFormat(plus = -1).toLocalDate().toString)
    println(LocalDate.now().customPlusFormat(plus = -1).toLocalDate().toJsonString)
  }
}
