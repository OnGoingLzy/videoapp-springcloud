package com.lzy.a.service.impl;

import com.lzy.a.entity.Video;
import com.lzy.a.mapper.VideoMapper;
import com.lzy.a.service.IVideoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lzy
 * @since 2023-02-21
 */
@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements IVideoService {

}
