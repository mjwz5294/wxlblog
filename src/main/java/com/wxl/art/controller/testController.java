package com.wxl.art.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class testController {
    @ResponseBody
    @RequestMapping("/test1")
    private String test1(){
        System.out.println("进了方法 test1");
        return "hahaha1";
    }

    @ResponseBody
    @RequestMapping("/test")
    private String test(){
        System.out.println("进了方法 test");
        return "hahaha";
    }
}
