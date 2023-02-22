package com.lzy.a.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lzy.a.entity.Video;
import com.lzy.a.mapper.VideoMapper;
import com.lzy.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

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
            for (Video video : videoList) {
                System.out.println(video);
            }
            return "redis中存在videolist";
        }else{
            System.out.println("exists is false");
            List<Video> videoList = videoMapper.selectList(null);
            redisUtil.setList("allvideo",videoList);

            for (Video video : videoList) {
                System.out.println(video);
            }
            return "redis中不存在videolist";
        }


    }
}
