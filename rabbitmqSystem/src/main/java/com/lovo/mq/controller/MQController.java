package com.lovo.mq.controller;

import com.lovo.mq.service.MQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MQController {
   @Autowired
   private MQService mqService;
    @GetMapping("send/{message}")
    public String sendMessage(@PathVariable("message")String message){
        mqService.seadMessage(message);
        return "send ok";
    }
}
