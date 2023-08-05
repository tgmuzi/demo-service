package com.example.demo.service.modules.user.service;

import com.example.demo.modules.entity.user.entity.SysUser;

public interface SysUserService {

    /**
     * 保存用户
     */
    void save(SysUser user, Long sysUserId);
}