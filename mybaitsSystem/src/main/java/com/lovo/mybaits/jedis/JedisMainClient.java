package com.lovo.mybaits.jedis;

import com.lovo.mybaits.model.SysUser;

public class JedisMainClient {
    public static void main(String[] args) {
        JedisMain jedisMain=new JedisMain();
       SysUser user= (SysUser) jedisMain.getObject("user");
        System.out.println(user.getUserName());
    }
}
