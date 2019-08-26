package com.jy.controller;

import com.jy.Employee;
import com.jy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class SomeController {

    @Autowired
    private EmployeeService employeeService;

    //@GetMapping("")
    @PostMapping("/register")
    public String someHandle(Employee employee){
        employeeService.addEmployee(employee);
        int i= 3/0;
        employeeService.addEmployee(employee);
        return "page/welcome";
    }
}
