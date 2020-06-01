package com.lovo.jwt.controller;

import com.lovo.jwt.util.JwtUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
     @PostMapping("login")
    public String login(String userName,String password){
         String token="";
         if(userName.equals("zy")&&password.equals("123456")){
             //登录成功，返回token给客户端
           token=    JwtUtil.sign(userName,password);

         }
      return token;
    }
}
