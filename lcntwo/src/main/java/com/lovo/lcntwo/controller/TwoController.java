package com.lovo.lcntwo.controller;

import com.lovo.lcntwo.bean.SysUser;
import com.lovo.lcntwo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {
   @Autowired
   private SysUserService sysUserService;
    @GetMapping("sava")
    public String sava(){
        SysUser user=new SysUser();
        user.setUserName("曹操");
        user.setUName("cc");

            sysUserService.savaUser(user);

        return "成功";
    }

}
