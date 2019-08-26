package com.jy.config;

import com.jy.interceptor.SomeInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@Configuration
public class SomeWebConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        SomeInterceptor someInterceptor=new SomeInterceptor();
        registry.addInterceptor(someInterceptor).addPathPatterns("/first/**").excludePathPatterns("/second/**");
    }
}
