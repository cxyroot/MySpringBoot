package com.jy.dao;


import com.jy.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeDao {
    void insertEmployee(Employee employee);
}
