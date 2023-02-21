package com.lzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer  //启动eureka，开启服务
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }

    @Bean   //交给spring容器管理
    @LoadBalanced  // 支持使用服务名称发现服务进行调用，且支持负载
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}