package com.jy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//@ServletComponentScan("com.jy.servlet")
public class Springboot08InterceptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot08InterceptorApplication.class, args);
	}

}
