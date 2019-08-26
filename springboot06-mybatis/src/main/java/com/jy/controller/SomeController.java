package com.jy.controller;

import com.jy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SomeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/some")
    public String someHandle(){
        return "page/welcome";
    }
}
