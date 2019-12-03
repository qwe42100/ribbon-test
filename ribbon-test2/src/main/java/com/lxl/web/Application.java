package com.lxl.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @RequestMapping("test2")
    public String test1(){
        System.out.println("=========test1============");
        return "test2-ok";
    }

}
