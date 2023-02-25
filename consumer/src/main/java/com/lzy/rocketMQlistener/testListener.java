package com.lzy.rocketMQlistener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author 22310
 * @version 1.0
 * @description TODO
 * @date 2023/2/23 22:19
 */
@Service
@RocketMQMessageListener(consumerGroup = "my-group2",topic = "test-topic")
public class testListener implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("我是消费者已经接收到:"+s);

    }
}
