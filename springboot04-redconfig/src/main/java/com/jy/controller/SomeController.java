package com.jy.controller;

import com.jy.dto.CountryDTO;
import com.jy.dto.GroupDTO;
import com.jy.dto.StudnetDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//读取自定义配置文件。
//读取自定义的对象属性
@PropertySource("classpath:custom.properties")
public class SomeController {
    @Value("${company.name}")
    private String companyName;

    @Value("${city.name}")
    private String cityName;

    @Autowired
    private StudnetDTO studnetDTO;

    @Autowired
    private CountryDTO countryDTO;

    @Autowired
    private GroupDTO groupDTO;

    @GetMapping("/some")
    public String someHandle(){
        return groupDTO.toString();
    }
}
