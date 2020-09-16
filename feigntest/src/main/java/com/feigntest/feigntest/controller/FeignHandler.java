package com.feigntest.feigntest.controller;


import com.feigntest.feigntest.entity.Student;
import com.feigntest.feigntest.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZFW
 * @create 2020-09-15 15:22
 */
@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/get/{key}")
    public Student get(@PathVariable("key") String key){
        return feignProviderClient.get(key);
    }


    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
