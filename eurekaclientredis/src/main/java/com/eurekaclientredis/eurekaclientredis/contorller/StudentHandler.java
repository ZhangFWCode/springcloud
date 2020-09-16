package com.eurekaclientredis.eurekaclientredis.contorller;

import com.eurekaclientredis.eurekaclientredis.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @author ZFW
 * @create 2020-09-10 13:54
 */
@RestController
@RequestMapping("/redistest")
public class StudentHandler {

    @Autowired
    private RedisTemplate redisTemplate;

    @PostMapping("/set")
    public void set(@RequestBody Student student)
    {
        redisTemplate.opsForValue().set("student",student);
    }


    @GetMapping("/get/{key}")
    public Student get(@PathVariable("key") String key)
    {
        return (Student) redisTemplate.opsForValue().get(key);
    }

    @GetMapping("/get1/{key}")
    public Object get1(@PathVariable("key") String key)
    {
        return  redisTemplate.opsForValue().get(key);
    }


    @DeleteMapping("/delete/{key}")
    public boolean delete(@PathVariable("key") String key)
    {
        redisTemplate.delete(key);
        return redisTemplate.hasKey(key);
    }

}
