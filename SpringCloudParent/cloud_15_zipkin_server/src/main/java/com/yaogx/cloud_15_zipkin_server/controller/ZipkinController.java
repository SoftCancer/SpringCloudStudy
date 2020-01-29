package com.yaogx.cloud_15_zipkin_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: YaoGuangXun
 * @date: 2020/1/25 23:37
 * @Version: 1.0
 */
@RestController
public class ZipkinController {


    @GetMapping("/yaosy")
    public String getYaosy(){
        return "I am zipkin-server！" ;
    }

}
