package com.lzy.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 22310
 * @version 1.0
 * @description TODO
 * @date 2023/2/20 22:36
 */
@FeignClient(value="provider")//要访问的提供者
@Service
@Component
public interface consumerApiTest1 {
    @GetMapping("/test1provider")//调用提供者某接口名,使用name="test1provider"时出错，因为name是直接给出url，并没有连接到provider
    String show();
}
