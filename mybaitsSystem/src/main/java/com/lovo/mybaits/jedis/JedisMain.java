package com.lovo.mybaits.jedis;

import com.lovo.mybaits.model.SysUser;
import com.lovo.mybaits.util.JedisDB;
import com.lovo.mybaits.util.ObjectBytes;

public class JedisMain {

    public static void main(String[] args) {
       JedisMain jedisMain=new JedisMain();
//        jedisMain.setString("userName","赵云");
//        System.out.println(jedisMain.getString("userName"));

        SysUser user=new SysUser();
        user.setUName("zy");
        user.setUserName("赵云");
        jedisMain.setObject("user",user);




    }

    /**
     * 保持字符串
     */
    public void  setString(String key,String val){
        JedisDB.creatJedis().set(key,val);
      //  JedisDB.creatJedis().setex("userName",10,"赵云");
    }

     public String getString(String key){
        return  JedisDB.creatJedis().get(key);
     }

    /**
     * 保持对象
     * @param key
     * @param object
     */
     public void setObject(String key,Object object){
        //key 和val 都要是二进制
         JedisDB.creatJedis().set(key.getBytes(), ObjectBytes.serialize(object));
     }

     public Object getObject(String key){
         return  ObjectBytes.unserizlize(JedisDB.creatJedis().get(key.getBytes()));
     }

}
