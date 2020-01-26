package com.yaogx.cloud_Ribbon_01.controller;

import com.yaogx.cloud_Ribbon_01.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: YaoGuangXun
 * @date: 2020/1/25 23:37
 * @Version: 1.0
 */

@RestController
public class RibbonController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/user/hello")
    public String hi(){
        return helloService.hiService();
    }
}
