package com.ssmdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: ssmdemo06
 * @description: this is a test controller.
 * @author: Mr.Wang
 * @create: 2018-03-01 17:29
 **/

@Controller
@RequestMapping("/test")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
