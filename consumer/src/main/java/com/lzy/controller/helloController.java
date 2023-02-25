package com.lzy.controller;

import com.lzy.api.consumerApiTest1;
import com.lzy.api.consumerApiTest2;
import com.lzy.rocketMQlistener.testListener;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 22310
 * @version 1.0
 * @description TODO
 * @date 2023/2/20 21:02
 */
@RestController
@RequestMapping("consumer")
public class helloController {
    @Autowired
    private consumerApiTest1 consumerApiTest1;
    @Autowired
    private consumerApiTest2 consumerApiTest2;

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String show() {
        System.out.println("消费者调用生产者的test1provider接口");
        return consumerApiTest1.show();
    }
    @RequestMapping(value = "/showvideo",method = RequestMethod.GET)
    public String showvideo(){
        System.out.println("消费者调用dao模块的一个方法");
        return consumerApiTest2.test1();
    }

    @Autowired
    private testListener testListener;
    @GetMapping("/rocketMQtest")
    public String showRocketMQtest(){

        return consumerApiTest2.test2();
    }

    @GetMapping("/addlike")//并发点赞测试
    public String addVideoBelike(@RequestParam("videoid") String videoid){
        System.out.println("当前线程id:"+Thread.currentThread().getId());
        return consumerApiTest2.test3(videoid);
    }

}