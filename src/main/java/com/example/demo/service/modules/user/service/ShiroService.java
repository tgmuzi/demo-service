package com.example.demo.service.modules.user.service;

import com.example.demo.modules.entity.user.entity.SysUserToken;

public interface ShiroService {

    SysUserToken queryByUserId(Long userId);

    SysUserToken queryByToken(String token);
}