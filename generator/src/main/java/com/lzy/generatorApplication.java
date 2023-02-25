package com.lzy;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.annotation.Resource;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.lzy.a.mapper")
public class generatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(generatorApplication.class,args);
    }
}