package com.lovo.lcntwo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.lovo.lcntwo.bean.SysUser;
import com.lovo.lcntwo.mapper.SysUserMapper;
import com.lovo.lcntwo.service.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(rollbackFor = Exception.class)
    public boolean savaUser(SysUser user) {
        this.save(user);
        int i=1/0;
        return false;
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
