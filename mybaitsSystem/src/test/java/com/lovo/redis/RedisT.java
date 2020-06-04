package com.lovo.redis;

import com.lovo.mybaits.MybaitsMain;
import com.lovo.mybaits.util.RedisCacheUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybaitsMain.class)
public class RedisT {
    @Autowired
    RedisCacheUtil redisCacheUtil;
    @Test
    public  void setString(){
        redisCacheUtil.set("info","hello redis");
    }
}
