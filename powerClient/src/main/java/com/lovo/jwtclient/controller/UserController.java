package com.lovo.jwtclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

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

    @GetMapping("remote")
   public String remoteString(){
        ResponseEntity responseEntity=
        restTemplate.getForEntity("http://127.0.0.1:8001/getRestTemplet",String.class);
        return responseEntity.getBody().toString();
   }
}
