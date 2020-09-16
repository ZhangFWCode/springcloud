package com.feigntest.feigntest.feign.impl;


import com.feigntest.feigntest.entity.Student;
import com.feigntest.feigntest.feign.FeignProviderClient;

/**
 * @author ZFW
 * @create 2020-09-15 15:25
 */
public class FeignError implements FeignProviderClient {
    @Override
    public Student get(String key) {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中！！！";
    }
}
