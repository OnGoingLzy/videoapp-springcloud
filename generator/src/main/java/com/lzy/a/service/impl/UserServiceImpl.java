package com.lzy.a.service.impl;

import com.lzy.a.entity.User;
import com.lzy.a.mapper.UserMapper;
import com.lzy.a.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
