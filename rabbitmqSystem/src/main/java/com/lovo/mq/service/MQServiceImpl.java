package com.lovo.mq.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service(value = "mqService")
public class MQServiceImpl implements MQService{
    @Autowired
    RabbitTemplate rabbitTemplate;

    //消息确认
    RabbitTemplate.ConfirmCallback confirmCallback= new  RabbitTemplate.ConfirmCallback(){

        public void confirm(CorrelationData correlationData, boolean b, String s) {
            System.out.println("correlationData="+correlationData.getId());
            //修改数据库

            System.out.println("b="+b);
            System.out.println("s="+s);
            //写业务  如果 b=true 代表数据已经放入到队列，根据correlationData 修改本地数据tag=1()
        }
    };
    //回退
    RabbitTemplate.ReturnCallback returnCallback=new RabbitTemplate.ReturnCallback() {
        @Override
        public void returnedMessage(Message message, int i, String s, String s1, String s2) {
            System.out.println("message="+message);

            System.out.println("i="+i);
            System.out.println("s="+s);
            System.out.println("s1="+s1);
            System.out.println("s2="+s2);
        }
    };

    public void seadMessage(String message){
        rabbitTemplate.setMandatory(true);//开启消息确认
        //绑定回调函数
        rabbitTemplate.setConfirmCallback(confirmCallback);
        rabbitTemplate.setReturnCallback(returnCallback);
       // String uuid= UUID.randomUUID().toString();
        //消息确认唯一标志，一定要保证唯一
        CorrelationData correlationData=new CorrelationData("order0001");
        //订单保存到数据库

       // System.out.println(correlationData.getId()+"/uuid="+uuid);
        rabbitTemplate.convertAndSend("pointDirectExchange","pointKey",message,correlationData);

    }
}
