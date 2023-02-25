package com.lzy.a.service;

import apache.rocketmq.v2.Message;
import com.mysql.cj.MessageBuilder;
import org.apache.rocketmq.spring.core.RocketMQListener;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.bouncycastle.cms.PasswordRecipientId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.swing.*;

/**
 * @author 22310
 * @version 1.0
 * @description TODO
 * @date 2023/2/23 22:04
 */
@Service
public class providerSmsService {


//    @Autowired
//    private RocketMQTemplate rocketMQTemplate;

    public void submitMessage(String s) {
        System.out.println("生产者发送消息: "+s);
//        rocketMQTemplate.convertAndSend("test-topic",s);
    }
}
