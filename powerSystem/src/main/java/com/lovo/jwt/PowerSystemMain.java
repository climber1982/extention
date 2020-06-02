package com.lovo.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PowerSystemMain {
    public static void main(String[] args) {
        SpringApplication.run(PowerSystemMain.class);
    }
}
