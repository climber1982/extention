package com.lovo.lcntwo;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDistributedTransaction
public class LcnTwoMain {
    public static void main(String[] args) {
        SpringApplication.run(LcnTwoMain.class);
    }
}
