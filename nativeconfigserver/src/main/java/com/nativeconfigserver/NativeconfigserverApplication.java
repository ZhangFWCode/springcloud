package com.nativeconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class NativeconfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeconfigserverApplication.class, args);
    }

}
