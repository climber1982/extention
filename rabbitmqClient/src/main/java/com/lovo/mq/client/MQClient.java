package com.lovo.mq.client;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MQClient {

//    @RabbitListener(queues = "pointQueueJ174")
//    public void getMessage(String message){
//        System.out.println(message);
//    }

    @RabbitListener(queues = "pointQueueJ174")
    public void getMessage2(String message, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag){

        System.out.println(message);
        try {
            channel.basicNack(tag,false,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        //手动确认
//        try {
//            //channel.basicNack(tag,false);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
