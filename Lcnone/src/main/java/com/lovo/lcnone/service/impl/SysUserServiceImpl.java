package com.lovo.lcnone.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.lovo.lcnone.bean.SysUser;
import com.lovo.lcnone.mapper.SysUserMapper;
import com.lovo.lcnone.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author DongChen
 * @since 2020-06-01
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private RestTemplate restTemplate;

    @Transactional(rollbackFor = Exception.class)
    public boolean savaUser(SysUser user) {
        this.save(user);
        //远程调用
        restTemplate.getForEntity("http://127.0.0.1:6667/sava",null);
        return true;
    }

    @Override
    public List<SysUser> getByUserName(String userName) {
        return null;
    }

    @Override
    public List<SysUser> getByUserNameLikePage(String userName, long current) {
        return null;
    }

    @Override
    public SysUser getUserNameAndPassword(String userName, String password) {
        return null;
    }
}
