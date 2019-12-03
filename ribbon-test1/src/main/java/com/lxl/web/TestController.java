package com.lxl.web;

import com.lxl.api.TestApi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestApi testApi;

    @RequestMapping("test02/{name}")
    @HystrixCommand(fallbackMethod = "testBack")
   public String test(@PathVariable String name){
        return testApi.test01(name);
    }

    public String testBack(String name){
        return "出错了-参数--》"+name;
    }

}
