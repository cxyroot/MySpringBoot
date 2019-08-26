package com.jy.config;

import com.jy.servlet.SomeServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean<SomeServlet> getServletRegistrationBean(){
        return new ServletRegistrationBean(new SomeServlet(),"/some");
    }
}
