package com.macro.mall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("http://localhost:8090")
//                .allowedMethods("GET", "POST", "OPTIONS", "DELETE", "PUT")
//                .allowedHeaders("Origin", "X-Requested-With", "Content-Type", "Accept", "Authorization")
//                .allowCredentials(true);
    }
}
