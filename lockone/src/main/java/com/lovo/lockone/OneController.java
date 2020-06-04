package com.lovo.lockone;

import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.TimeUnit;

@RestController
public class OneController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RedissonClient redisson;

    @GetMapping("addone/{num}")
    public  String addtwo(@PathVariable("num")int num){
        RLock rLock= redisson.getLock("resocueLock");

        boolean bl=false;
        try {
          bl=      rLock.tryLock(200,100, TimeUnit.SECONDS);
            try {
                Thread.sleep(1000*60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(bl);
        if(bl)
        return restTemplate.getForEntity("http://127.0.0.1:7000/add/"+num,String.class).getBody();
     return "";
    }
}
