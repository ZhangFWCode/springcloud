package com.consumer.consumer.controller;

import com.consumer.consumer.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ZFW
 * @create 2020-09-11 11:01
 */
@RestController
@RequestMapping("/consumer")
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
