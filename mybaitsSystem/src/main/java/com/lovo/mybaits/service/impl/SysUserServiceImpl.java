package com.lovo.mybaits.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lovo.mybaits.mapper.SysUserMapper;
import com.lovo.mybaits.model.SysUser;
import com.lovo.mybaits.service.SysUserService;
import org.springframework.stereotype.Service;

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

    @Override
    public boolean savaUser(SysUser user) {
        //保存
       return this.save(user);
    }

    @Override
    public List<SysUser> getByUserName(String userName) {
        QueryWrapper<SysUser> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_name",userName);
        return this.list(queryWrapper);
    }

    public List<SysUser> getByUserNameLikePage(String userName,long current) {
        QueryWrapper<SysUser> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("user_name",userName+"%");
        IPage<SysUser> page =null;
           page=  this.page(new Page<>(1,8),queryWrapper);
         return   page.getRecords();

    }
}
