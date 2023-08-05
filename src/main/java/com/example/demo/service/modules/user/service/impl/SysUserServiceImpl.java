package com.example.demo.service.modules.user.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.modules.mapper.user.SysUserMapper;
import com.example.demo.modules.entity.user.entity.SysUser;
import com.example.demo.service.modules.user.service.SysUserService;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public void save(SysUser user, Long sysUserId) {

        user.setCreateTime(new Date());
        // sha256加密
        String salt = RandomStringUtils.randomAlphanumeric(20);
        user.setPassword(new Sha256Hash(user.getPassword(), salt).toHex());
        user.setSalt(salt);
        baseMapper.insert(user);

    }

}