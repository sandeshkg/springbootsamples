package com.sharemarket.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeController {

    @Value("${message}")
    private String message;

    @RequestMapping("/index")
    public String Index(){
        return "Hello"+ message + "...!!";
    }
}
