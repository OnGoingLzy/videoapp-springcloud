package com.lzy.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lzy.a.entity.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 22310
 * @version 1.0
 * @description TODO
 * @date 2023/2/22 19:09
 */
@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private ObjectMapper objectMapper;

    /**
     * 将对象序列化为JSON字符串
     */
    private String toJsonString(Object object) throws JsonProcessingException {
        return objectMapper.writeValueAsString(object);
    }

    /**
     * 将JSON字符串反序列化为对象
     */
    private <T> T fromJsonString(String jsonString, Class<T> clazz) throws JsonProcessingException {
        return objectMapper.readValue(jsonString, clazz);
    }

    /**
     * 将List序列化为JSON字符串并存储到Redis
     */
    public void setList(String key, List<Video> list) throws JsonProcessingException {
        String value = toJsonString(list);
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * 从Redis中获取JSON字符串并反序列化为List
     */
    public List<Video> getList(String key) throws JsonProcessingException {
        String value = (String) redisTemplate.opsForValue().get(key);
        List<Video> list = objectMapper.readValue(value, new TypeReference<List<Video>>() {
        });
        return list;
    }
}