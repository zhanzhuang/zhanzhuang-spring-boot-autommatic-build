package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jensen Zhan
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test() {
//        return "向github提交代码触发jenkins自动构建";
        return "向github提交代码触发jenkins自动构建测试   ";
    }
}
