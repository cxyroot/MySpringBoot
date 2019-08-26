package com.jy.service;

import com.jy.Employee;
import org.springframework.stereotype.Service;


public interface EmployeeService {
    void addEmployee(Employee employee);
    Integer findEmployeeCount();
}
