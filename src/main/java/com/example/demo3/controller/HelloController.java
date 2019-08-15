package com.example.demo3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private HelloController() {
    }
    @RequestMapping("/helloworld")
    public String HelloWorld() {
        return "Hello World!";
    }

    @RequestMapping("/")
    public String index() {
        int a = 1;
        if(a>1){
            System.out.println("success");
        }else {
            System.out.println("fail");
        }

        return "index!";
    }

    @RequestMapping("/test")
    public String test() {
        return "test!";
    }
}