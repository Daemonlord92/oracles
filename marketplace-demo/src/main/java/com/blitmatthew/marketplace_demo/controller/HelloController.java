package com.blitmatthew.marketplace_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    //GetMapping
    // It is used to hit an endpoint with a GET Http Method Request
    @GetMapping("/")
    public String getHello() {
        // In a MVC Application every endpoint is going to return a string
        // reason for this the spring boot is setup to look for the template name written in the string
        return "hello";
    }
}
