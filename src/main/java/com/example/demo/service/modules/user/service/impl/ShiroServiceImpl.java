package com.example.demo.service.modules.user.service.impl;

import com.example.demo.modules.mapper.user.SysUserTokenMapper;
import com.example.demo.modules.entity.user.entity.SysUserToken;
import com.example.demo.service.modules.user.service.ShiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShiroServiceImpl implements ShiroService {

    @Autowired
    private SysUserTokenMapper mapper;

    @Override
    public SysUserToken queryByUserId(Long userId) {
        return mapper.queryByUserId(userId);
    }

    @Override
    public SysUserToken queryByToken(String token) {
        return mapper.queryByToken(token);
    }

}