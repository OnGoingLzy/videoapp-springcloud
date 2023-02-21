package com.lzy.a.service.impl;

import com.lzy.a.entity.Categories;
import com.lzy.a.mapper.CategoriesMapper;
import com.lzy.a.service.ICategoriesService;
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
public class CategoriesServiceImpl extends ServiceImpl<CategoriesMapper, Categories> implements ICategoriesService {

}
