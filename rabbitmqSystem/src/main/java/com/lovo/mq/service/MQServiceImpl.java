package com.lovo.mq.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "mqService")
public class MQServiceImpl implements MQService{
    @Autowired
    RabbitTemplate rabbitTemplate;

    public void seadMessage(String message){
        rabbitTemplate.convertAndSend("pointDirectExchange","pointKey",message);
    }
}
