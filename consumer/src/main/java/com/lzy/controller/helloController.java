package com.lzy.controller;

import com.lzy.api.consumerApiTest1;
import com.lzy.api.consumerApiTest2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}