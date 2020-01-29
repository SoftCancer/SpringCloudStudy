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
        logger.log(Level.INFO, "hi is  sleuth_client_02");
        return "hi i'm  sleuth_client_02!";
    }

    @RequestMapping("/client_02")
    public String info(){
        logger.log(Level.INFO, "info is  sleuth_client_02");
        return restTemplate.getForObject("http://127.0.0.1:9108/info",String.class);
    }
}
