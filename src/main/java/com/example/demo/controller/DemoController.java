package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.dto.DemoDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demoControllerMethod() {
        return "this is demo controller method";
    }

    @GetMapping("/another")
    public String demo01ControllerMethod() {
        return "this is anther controller method";
    }

    @PostMapping("/demo")
    public void demoPostMethod(@RequestBody DemoDTO demoDTO) {
        System.out.println(JSON.toJSONString(demoDTO));
    }
}
