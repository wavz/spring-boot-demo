package com.example.demo.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SimpleController {


    @RequestMapping("/")
    public String hello(){
        return "hello";
    }


}
