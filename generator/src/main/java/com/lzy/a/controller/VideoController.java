package com.lzy.a.controller;

import com.lzy.a.entity.Video;
import com.lzy.a.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/test1")
    public String test1(){
        System.out.println(("----- selectAll method test ------"));
        List<Video> videoList = videoMapper.selectList(null);
        for (Video video : videoList) {
            System.out.println(video);
        }
        return "success";
    }
}
