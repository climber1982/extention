package com.lovo.lcnone.controller;

import com.lovo.lcnone.bean.SysUser;
import com.lovo.lcnone.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OneController {

    @Autowired
    private SysUserService sysUserService;
    @GetMapping("savaone")
    public  void  savaOne(){
        SysUser user=new SysUser();
        user.setUserName("马超");
        user.setUName("mc");
        sysUserService.savaUser(user);
    }
}
