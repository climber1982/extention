package com.lovo.test;

import com.lovo.mq.MQMain;
import com.lovo.mq.service.MQService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MQMain.class)
public class MQTest {
    @Autowired
    private MQService mqService;
    @Test
    public void sendMQ(){
      mqService.seadMessage("hello rabbitmq");
    }
}
