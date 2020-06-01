package com.lovo.mybaits.service;

import com.lovo.mybaits.model.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author DongChen
 * @since 2020-06-01
 */
public interface SysUserService extends IService<SysUser> {
    /**
     * 保存用户
     * @param user
     */
    public boolean savaUser(SysUser user);

    /**
     * 根据用户名查询集合
     * @param userName
     * @return
     */
    public List<SysUser> getByUserName(String  userName);

    /**
     * 根据用户名查询集合
     * @param userName
     * @return
     */
    public List<SysUser> getByUserNameLikePage(String  userName,long current);
}
