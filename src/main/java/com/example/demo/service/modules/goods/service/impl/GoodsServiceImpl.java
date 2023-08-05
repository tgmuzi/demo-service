package com.example.demo.service.modules.goods.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.modules.entity.goods.entity.Goods;
import com.example.demo.modules.mapper.goods.mapper.GoodsMapper;
import com.example.demo.service.modules.goods.service.IGoodsService;
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
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
