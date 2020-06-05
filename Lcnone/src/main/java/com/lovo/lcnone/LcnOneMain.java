package com.lovo.lcnone;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDistributedTransaction
public class LcnOneMain {
    public static void main(String[] args) {
        SpringApplication.run(LcnOneMain.class);
    }
}
