package com.yaogx.cloud_eureka_feign_01.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description:   <p>一个Feign服务消费者接口</p>
 * @author: YaoGuangXun
 * @date: 2020/1/2321:55
 * @Version: 1.0
 */
//通过@FeignClient标识当前接口是一个Feign客户端，value = "server_clien"表示其针对的是名为service-hi的服务。
// server_clien 则是我们cloud_eureka_client_01子模块的spring.application.name，这个name已经在eureka注册过
@FeignClient(value = "server-client")
public interface IUserService {

    /**
     *  <p>通过Feign伪Http客户端调用service-hi提供的服务</p>
     *  getHiFromUserService  方法为伪装成HTTP客户端方法，
     *  与 cloud_eureka_client_01 模块的[GET] /hi/{name}服务接口相对应。
     * @Date: 2020/1/23 21:59
     **/
    @GetMapping("/hi/{name}")
    String getHiFromUserService(@PathVariable(value = "name") String name);
}
