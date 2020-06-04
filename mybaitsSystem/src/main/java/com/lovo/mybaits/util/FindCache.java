package com.lovo.mybaits.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindCache {
    @Autowired
    RedisCacheUtil redisCacheUtil;
    /**
     * 从缓存中获取一个对象
     * @param key
     * @return
     */
    public Object getCacheObject(String key){
       return redisCacheUtil.get(key);
    }

    /**
     * 保存缓存
     * @param key
     * @param val
     */
    public void setCacheObject(String key,Object val,long time){
        redisCacheUtil.set(key,val,time);
    }
}
