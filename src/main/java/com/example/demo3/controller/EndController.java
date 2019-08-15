package com.example.demo3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndController {
    private EndController() {
    }
    @RequestMapping("/end")
    public String HelloWorld() {
        return "end!";
    }

}