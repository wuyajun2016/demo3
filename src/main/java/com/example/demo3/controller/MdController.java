package com.example.demo3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MdController {
    @RequestMapping("/md")
    public String HelloWorld() {
//        MdController mc = new MdController();
        return "md controller!";
    }

}