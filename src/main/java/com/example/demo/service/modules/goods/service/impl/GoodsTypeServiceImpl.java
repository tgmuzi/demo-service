package com.example.demo.service.modules.goods.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.modules.entity.goods.entity.GoodsType;
import com.example.demo.modules.mapper.goods.mapper.GoodsTypeMapper;
import com.example.demo.service.modules.goods.service.IGoodsTypeService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author muzi
 * @since 2023-07-26
 */
@Service
public class GoodsTypeServiceImpl extends ServiceImpl<GoodsTypeMapper, GoodsType> implements IGoodsTypeService {

}
