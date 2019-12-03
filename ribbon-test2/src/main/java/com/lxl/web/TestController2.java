package com.lxl.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {

    @RequestMapping("test1")
    public String test(String name){
        System.out.println("==========name========"+name);
        return "test2-ok";
    }


}
