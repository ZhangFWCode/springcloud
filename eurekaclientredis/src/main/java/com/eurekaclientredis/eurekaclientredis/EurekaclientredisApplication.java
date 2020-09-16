package com.eurekaclientredis.eurekaclientredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaclientredisApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientredisApplication.class, args);
    }

}
