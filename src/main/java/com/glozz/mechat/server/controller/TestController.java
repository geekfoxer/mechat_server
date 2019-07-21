package com.glozz.mechat.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuji on 2019-07-20
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "hello";
    }

}
