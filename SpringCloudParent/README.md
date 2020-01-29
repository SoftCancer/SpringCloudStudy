# SpringCloudParent 
学习SpringCloud

## 该项目总共包含 10 个模块，各模块对应功能如下：

### 模块一： cloud_eureka_01 ： 实现SpringCloud 整合 Eureka 注册中心。


### 模块二： cloud_eureka_client_01 ： 实现SpringCloud 整合 Eureka 服务的提供者。

### 模块三： cloud_eureka_client_02 ： 实现SpringCloud 整合 Eureka 服务的提供者。


### 模块四： cloud_eureka_feign_01 ： 实现SpringCloud 整合 Eureka 服务的消费者。
    需要依次启动：模块一，模块二，模块三。

### 模块五： cloud_eureka_hystrix_02 ： 实现SpringCloud 整合 hystrix 实现熔断器。


### 模块六： cloud_Ribbon_01 ： 实现SpringCloud 整合 Ribbon 实现负载均衡。
    需要依次启动：模块一，模块二，模块三，模块六。

### 模块七： cloud_zuul_01 ： 实现SpringCloud 整合 Zuul 实现路由和过滤功能。
    测试路由功能 需要依次启动：模块一，模块二，模块四，模块六,模块七。
    
    
### 模块八： cloud_10_config_server ： 实现SpringCloud 整合分布式配置中心 config-server。


### 模块九： cloud_11_config_client ： 实现SpringCloud 整合分布式配置中心 config_client。
    依次启动： cloud_10_config_server，cloud_11_config_client 子模块

### 模块八： cloud_12_config_server_high ： 实现SpringCloud 整合高可用分布式配置中心 config-server。


### 模块九： cloud_13_config_client_high ： 实现SpringCloud 整合高可用分布式配置中心 config_client。
    依次启动： cloud_eureka_01 ，cloud_12_config_server_high，cloud_13_config_client_high 子模块
 
 
### 模块九： cloud_14_config_client_bus ： 实现SpringCloud 整合高消息总线(Spring Cloud Bus)。
    依次启动： cloud_eureka_01 ，cloud_12_config_server_high，cloud_14_config_client_bus 子模块.
    需要 RabbitMQ 支持，访问：http://127.0.0.1:9106/yaosy
 
 
 
    
    
该项目所对应的 简书地址如下：https://www.jianshu.com/c/4683518df962
