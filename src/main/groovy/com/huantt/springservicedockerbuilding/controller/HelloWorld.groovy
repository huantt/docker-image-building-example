package com.huantt.springservicedockerbuilding.controller

import groovy.transform.CompileStatic
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author huantt on 2019-06-02
 */
@RestController
@CompileStatic
@RequestMapping("/hello")
class HelloWorld {

    @GetMapping
    String hello() {
       return "Hello World!"
    }
}
