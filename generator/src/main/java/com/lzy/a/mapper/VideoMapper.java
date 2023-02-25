package com.lzy.a.mapper;

import com.lzy.a.entity.Video;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lzy
 * @since 2023-02-21
 */
@Mapper
@Component
public interface VideoMapper extends BaseMapper<Video> {

   boolean addLikeCountsByid(@Param("videoid") String videoid);
}
