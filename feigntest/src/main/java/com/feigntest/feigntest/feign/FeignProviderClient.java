package com.feigntest.feigntest.feign;


import com.feigntest.feigntest.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ZFW
 * @create 2020-09-15 15:05
 */

@FeignClient(value = "consumer")
public interface FeignProviderClient {


    @GetMapping("/consumer/get/{key}")
    public Student get(@PathVariable("key") String key);


    @GetMapping("/consumer/index")
    public String index();


}
