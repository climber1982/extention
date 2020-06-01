package com.lovo.mybaits.controller;


import com.lovo.mybaits.model.SysUser;
import com.lovo.mybaits.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author DongChen
 * @since 2020-06-01
 */
@RestController
public class SysUserController {

    @Autowired
    private SysUserService userService;

    @PostMapping("savaUser")
     public  String savaUser(SysUser user){
        boolean bl=false;
      for(int i=3;i<20;i++) {
          user.setUserName("赵云"+i);
          user.setUName("zy"+i);
          bl = userService.savaUser(user);
      }
      if(bl){
          return "ok";
      }
      return "no";
     }

     @PostMapping("getByUserName")
     public List<SysUser> getByUserName(String userName){
     return userService.getByUserName(userName);
     }

    @RequestMapping("getByUserNameLikePage")
    public List<SysUser> getByUserNameLikePage(String userName,long current){
        return userService.getByUserNameLikePage(userName, current);
    }
}
