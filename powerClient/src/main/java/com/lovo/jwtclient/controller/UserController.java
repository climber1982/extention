package com.lovo.jwtclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("userInfo/{tag}")
    public String userInfo(@PathVariable("tag")String tag){
        String info="";
        if(tag.equals("1")){
            info="hello jwt1";
        }else if(tag.equals("2")){
            info="hello jwt2";
        }
        return info;
    }
}
