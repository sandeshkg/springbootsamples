package com.sharemarket.com.stock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    @RequestMapping("/index")
    public String Index(){
        return "Hello Springboot...!!";
    }
}
