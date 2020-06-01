package com.lovo.shiro.controller;

import org.apache.shiro.SecurityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindUserController {

    @GetMapping("finduser")
    public String finduser(){
        //认证
        boolean bl=   SecurityUtils.getSubject().isPermitted("finduser");
        if(!bl){
            return "no power";
        }
        return "hello finduser";
    }

    @GetMapping("finduser1")
    public String finduser1(){
        //认证
        boolean bl=   SecurityUtils.getSubject().isPermitted("finduser1");
        if(!bl){
            return "no power";
        }
        return "hello finduser1";
    }
    @GetMapping("finduser2")
    public String finduser2(){
        //认证
        boolean bl=   SecurityUtils.getSubject().isPermitted("finduser2");
        if(!bl){
            return "no power";
        }
        return "hello finduser2";
    }
}
