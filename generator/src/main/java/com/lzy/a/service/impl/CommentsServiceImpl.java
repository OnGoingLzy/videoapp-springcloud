package com.lzy.a.service.impl;

import com.lzy.a.entity.Comments;
import com.lzy.a.mapper.CommentsMapper;
import com.lzy.a.service.ICommentsService;
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
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {

}
