package com.lzy.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 22310
 * @version 1.0
 * @description TODO
 * @date 2023/2/21 19:10
 */
@FeignClient(value="dao")//要访问的提供者
@Service
@Component
public interface consumerApiTest2 {
    @GetMapping("/test1")
    String test1();
}
