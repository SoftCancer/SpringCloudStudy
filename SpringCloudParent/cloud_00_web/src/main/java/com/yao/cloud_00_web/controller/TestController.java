package com.yao.cloud_00_web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: YaoGuangXun
 * @date: 2020/1/31 16:20
 * @Version: 1.0
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String getHello(){
        return " Hello Im 9111";
    }
}
