package com.configclient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZFW
 * @create 2020-09-16 10:10
 */
@RestController
@RequestMapping("/git")
public class ConfigHandler {

    @Value("${server.port}")
    private String port;


    @GetMapping("/index")
    public String index(){
        return this.port;
    }

}
