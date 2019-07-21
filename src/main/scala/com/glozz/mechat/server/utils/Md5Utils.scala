package com.glozz.mechat.server.utils

import org.springframework.util.DigestUtils

import scala.language.implicitConversions

/**
  *
  * Create by zhuji on 2019-07-20
  */
object Md5Utils {

  implicit def md5(value: String): String = DigestUtils.md5DigestAsHex(value.getBytes).toUpperCase

}
