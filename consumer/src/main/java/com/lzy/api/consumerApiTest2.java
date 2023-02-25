package com.lzy.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @GetMapping("/test1")//测试redis缓存
    String test1();

    @GetMapping("/test2")//测试rocketMQ
    String test2();

    @GetMapping("/test3")//测试并发点赞视频
    String test3(@RequestParam("videoid") String videoid);
}
