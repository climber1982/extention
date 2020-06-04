package com.lovo.mybaits.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lovo.mybaits.mapper.SysUserMapper;
import com.lovo.mybaits.model.SysUser;
import com.lovo.mybaits.service.SysUserService;
import com.lovo.mybaits.util.FindCache;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    FindCache findCache;

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
        queryWrapper.gt("userId",2);
        IPage<SysUser> page =null;
           page=  this.page(new Page<>(current,8),queryWrapper);
         return   page.getRecords();

    }

    @Override
    public SysUser getUserNameAndPassword(String userName, String password) {
        SysUser user=null;
                //组装缓存的key
        String key=userName+"_"+password;
        //先去缓存中获取对象
      Object object=  findCache.getCacheObject(key);
       //判断是否为空，如果为空去数据库中查询，并保存到缓存中
        if(null==object){
            QueryWrapper<SysUser> queryWrapper=new QueryWrapper<>();
            queryWrapper.eq("user_name",userName)
                    .eq("user_pass",password);
            user=  this.getOne(queryWrapper);
            //保存到缓存中
            findCache.setCacheObject(key,user,60*2);
            System.out.println("执行了SQL查询");
        }else {
            user = (SysUser) object;
        }

        return user;
    }

}
