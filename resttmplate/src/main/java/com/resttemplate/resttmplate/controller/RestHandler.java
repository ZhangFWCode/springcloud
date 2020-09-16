package com.resttemplate.resttmplate.controller;

import com.resttemplate.resttmplate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZFW
 * @create 2020-09-11 11:01
 */
@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/set")
    public void set(@RequestBody Student student)
    {
        restTemplate.postForEntity("http://localhost:8763/redistest/set",student,null).getBody();
    }


    @GetMapping("/get/{key}")
    public Student get(@PathVariable("key") String key)
    {
        return restTemplate.getForObject("http://localhost:8763/redistest/get/{key}",Student.class,key);
    }

    @DeleteMapping("/delete/{key}")
    public boolean delete(@PathVariable("key") String key)
    {
        restTemplate.delete("http://localhost:8763/redistest/delete/{id}",key);
        return true;
    }

}
