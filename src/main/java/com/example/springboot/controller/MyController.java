package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class MyController {
    @ResponseBody
    @RequestMapping("/hello")
    public String helloTest(){
        return "Hello!";
    }

    @RequestMapping("/test1")
    public String thymeleafDemo1(Map<String,Object> map){
        map.put("name","王五");
        return "success";
    }
}
