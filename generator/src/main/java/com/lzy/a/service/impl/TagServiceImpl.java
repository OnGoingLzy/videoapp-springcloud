package com.lzy.a.service.impl;

import com.lzy.a.entity.Tag;
import com.lzy.a.mapper.TagMapper;
import com.lzy.a.service.ITagService;
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
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
