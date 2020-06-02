package com.lovo.jwtclient.util;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Component
public class MyConfig implements WebMvcConfigurer {

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new UserInterceptor())
//                .addPathPatterns("/**");
//
//
//    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
