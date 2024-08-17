package com.gibran.usercrud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:user-data.properties")
public class PropertiesConfig {
}
