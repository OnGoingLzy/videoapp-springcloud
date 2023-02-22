package com.lzy;

import com.lzy.config.swaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({swaggerConfig.class})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.lzy")//consumer模块需要调用provider模块提供的服务，因此需要在启动类上添加@EnableFeignClients注解，
public class consumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(consumerApplication.class,args);
    }
}