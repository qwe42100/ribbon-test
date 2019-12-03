package com.lxl.api;

import org.springframework.stereotype.Component;

@Component
public class TestFallBackApi implements TestApi{


    @Override
    public String test01(String name) {
        return "出错了";

    }
}
