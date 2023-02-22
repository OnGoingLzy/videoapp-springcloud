package com.lzy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

/**
 * @author 22310
 * @version 1.0
 * @description TODO
 * @date 2023/2/22 15:35
 */
@Configuration
@EnableOpenApi //开启Swagger3
public class swaggerConfig {
    @Bean
    public Docket docket(Environment environment){
        //配置swagger要使用的环境
        Profiles profiles = Profiles.of("dev", "test");
        //environment。acceptsProfiles判断自己是否在自己设定的环境中
        boolean flag = environment.acceptsProfiles(profiles);

        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //指定我们需要基于什么包扫描
                .apis(RequestHandlerSelectors.basePackage("com.lzy.controller"))
                .build()
                .groupName("lzy");
                //.enable(flag);//eanble决定了是否启动swagger


    }
    // 配置swagger基本信息
    private ApiInfo apiInfo(){
        Contact contact = new Contact("xxx", "hyc.com", "2231003533@qq.com");
        return new ApiInfo(
                "consumer的swagger",
                "",
                "1.0",
                "hyc.com",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>());
    }

}
