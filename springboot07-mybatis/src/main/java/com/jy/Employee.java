package com.jy;

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable{
    private String id;
    private String name;
    private String age;
}
