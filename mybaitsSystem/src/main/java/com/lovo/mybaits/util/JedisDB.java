package com.lovo.mybaits.util;

import redis.clients.jedis.Jedis;

public class JedisDB {

    public static Jedis creatJedis(){
        Jedis jedis=new Jedis("127.0.0.1",6379);
        jedis.auth("123456");
         return jedis;
    }
}
