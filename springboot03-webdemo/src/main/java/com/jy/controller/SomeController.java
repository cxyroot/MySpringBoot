package com.jy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
    @GetMapping("/some")
    public String someHadle(){
        return "HelloWolrd SpringBoot!!!";
    }
}
