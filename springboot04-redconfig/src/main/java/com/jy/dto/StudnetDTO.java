package com.jy.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:custom.properties")
@ConfigurationProperties("student")
@Data
public class StudnetDTO {
    //http://localhost:8080/kkb/some
    private String name;
    private int age;
    private double score;
}
