package com.jy.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource(value = "classpath:custom.properties")
@ConfigurationProperties("country")
@Data
public class CountryDTO {
    private List<String> cities;
}
