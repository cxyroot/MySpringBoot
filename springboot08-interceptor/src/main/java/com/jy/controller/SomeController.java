package com.jy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
    @GetMapping("/first/some")
    public String fist(){
        return "first";
    }
    @GetMapping("/sencond/other")
    public String sencond(){
        return "sencond";
    }
}
