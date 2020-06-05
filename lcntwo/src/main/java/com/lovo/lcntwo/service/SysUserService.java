package com.lovo.lcntwo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lovo.lcntwo.bean.SysUser;

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
    public List<SysUser> getByUserName(String userName);

    /**
     * 根据用户名查询集合
     * @param userName
     * @return
     */
    public List<SysUser> getByUserNameLikePage(String userName, long current);

    /**
     * 根据用户和密码查询出用户对象
     * @param userName
     * @param password
     * @return
     */
    public SysUser getUserNameAndPassword(String userName, String password);
}
