package com.lovo.mq.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MQConfig {
    //注入工厂（已经预加载）
    @Autowired
    CachingConnectionFactory connectionFactory;
    //rabbitmq模板
    @Bean(value = "rabbitTemplate")
    public RabbitTemplate rabbitTemplate(){
           return new RabbitTemplate(connectionFactory);
    }

    //死信队列
    @Bean
    public  Queue deadQueue(){
        return new Queue("deadQueue");
    }
    //死信交换机
    @Bean
    public DirectExchange deadExchange(){
        return  new DirectExchange("deadExchange");
    }

    //死信交换机队列绑定
    @Bean
    public Binding deadQueueToDeadExchange(Queue deadQueue,DirectExchange deadExchange){
         return  BindingBuilder.bind(deadQueue).to(deadExchange).with("dead_routing_key");
    }


    //创建队列
    @Bean
    public Queue pointQueue(){
        //关联死信交换机
        Map<String, Object> args = new HashMap<>(3);
        // x-dead-letter-exchange    这里声明当前队列绑定的死信交换机
        args.put("x-dead-letter-exchange", "deadExchange");
        // x-dead-letter-routing-key  这里声明当前队列的死信路由key
        args.put("x-dead-letter-routing-key","dead_routing_key");
        // x-message-ttl  声明队列的TTL
       args.put("x-message-ttl", 6000);
        return QueueBuilder.durable("pointQueueJ174").withArguments(args).build();
    }

    @Bean
    public Queue pointQueueJ174(){
        return new Queue("pointQueueJ174");
    }
    //创建交换机
    @Bean
    public DirectExchange pointDirectExchange(){
       return  new DirectExchange("pointDirectExchange");
    }

    //把队列与交换机进行绑定
    @Bean
    public Binding pointQueueTopointDirectExchange(Queue pointQueueJ174,DirectExchange pointDirectExchange){
        return BindingBuilder.bind(pointQueueJ174).to(pointDirectExchange).with("pointKey");
    }









}
