package com.jy.service.impl;

import com.jy.Employee;
import com.jy.dao.EmployeeDao;
import com.jy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao dao;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;
    @Override
    @Transactional//开启事务
    public void addEmployee(Employee employee) {
        dao.insertEmployee(employee);
    }

    @Override
    public Integer findEmployeeCount() {
        BoundValueOperations<Object,Object> ops=redisTemplate.boundValueOps("count");
        Object count = ops.get();
        if(count==null){
            synchronized (this){
                count=ops.get();
                if (count==null){
                    //dao.findEmployeeCount
                    ops.set(count, 10,TimeUnit.SECONDS);
                }
            }
        }
        return (Integer) count;
    }
}
