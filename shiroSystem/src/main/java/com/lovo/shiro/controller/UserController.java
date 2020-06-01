package com.lovo.shiro.controller;

import com.lovo.shiro.entity.UserEntity;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

   @RequestMapping("loginUser")
    public  String loginUser(UserEntity user){
       //获得shiro主题
       Subject subject = SecurityUtils.getSubject();
       //把我们的用户和密码放入到shiro的token对象中
       UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
               user.getUserName(),
               user.getPassword()
       );
//进行验证，这里可以捕获异常，然后返回对应信息
       try {
           subject.login(usernamePasswordToken);
       }catch (Exception e){
           return "登录失败";
       }
        return "登录成功";
    }
}
