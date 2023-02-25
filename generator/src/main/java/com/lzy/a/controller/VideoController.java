package com.lzy.a.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lzy.a.entity.Video;
import com.lzy.a.mapper.VideoMapper;
import com.lzy.a.service.providerSmsService;
import com.lzy.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lzy
 * @since 2023-02-21
 */
@RestController
public class VideoController {

    @Autowired
    private VideoMapper videoMapper;
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private RedisTemplate redisTemplate;
    @GetMapping("/test1")
    public String test1() throws JsonProcessingException {
        System.out.println(("----- selectAll method test ------"));
        boolean exists=redisTemplate.hasKey("allvideo");
        if(exists){
            System.out.println("video is true");
            List<Video> videoList = redisUtil.getList("allvideo");
//            for (Video video : videoList) {
//                System.out.println(video);
//            }
            return "redis中存在videolist";
        }else{
            System.out.println("exists is false");
            List<Video> videoList = videoMapper.selectList(null);
            redisUtil.setList("allvideo",videoList);

//            for (Video video : videoList) {
//                System.out.println(video);
//            }
            return "redis中不存在videolist";
        }

    }
    @Autowired
    private providerSmsService providerSmsService;
    @GetMapping("/test2")
    public String rocketMQtest(){

        providerSmsService.submitMessage("戚国庆傻逼");
        return "success";
    }

    @GetMapping("/test3")//分布式锁，保证最终一致性
    public String addVideoBelike(@RequestParam("videoid") String videoid){
        String lockKey = "lockKey" + videoid;
        String requestId = UUID.randomUUID().toString();
        boolean locked = false;

        try {
            while (!locked) {
                locked = redisTemplate.opsForValue().setIfAbsent(lockKey, requestId, Duration.ofSeconds(10));//获取锁，超时时间10s，超时就释放

                if (!locked) {
                    Thread.sleep(100);//等0.1s再请求锁
                }
            }

//            // 模拟业务耗时
//            Thread.sleep(10);
            System.out.println("已获取分布式锁，执行业务");
            if(videoMapper.addLikeCountsByid(videoid)){
                System.out.print("---执行成功/n");
            }else {
                System.out.println("执行失败");
                redisTemplate.delete(lockKey);
                return "点赞失败!请重试";
            }

            redisTemplate.delete(lockKey);
            return "点赞成功!";

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "点赞失败!请重试";
    }


}
