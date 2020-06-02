package com.lovo.mq.client;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MQClient {

    @RabbitListener(queues = "pointQueueJ174")
    public void getMessage(String message){
        System.out.println(message);
    }
}
