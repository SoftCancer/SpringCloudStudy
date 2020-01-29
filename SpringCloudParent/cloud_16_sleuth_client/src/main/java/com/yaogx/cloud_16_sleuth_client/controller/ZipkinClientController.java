package com.yaogx.cloud_16_sleuth_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Description:
 * @author: YaoGuangXun
 * @date: 2020/1/25 23:37
 * @Version: 1.0
 */
@RestController
public class ZipkinClientController {
    private static final Logger logger = Logger.getLogger(ZipkinClientController.class.getName());


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String callHome(){
        logger.log(Level.INFO, "this is  zipkin-client1！");
        return restTemplate.getForObject("http://localhost:9109/client_02", String.class);
    }

    @RequestMapping("/info")
    public String info(){
        logger.log(Level.INFO, "this is  zipkin-client1！");
        return "i'm zipkin-client1";
    }
}
