package com.example.demo3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BBController {
    private BBController() {
    }
    @RequestMapping("/trust")
    public String trust() {

        return "trust";
    }

}