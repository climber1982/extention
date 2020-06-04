package com.lovo.resouce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResouceController {

    int i=1;
    @GetMapping("add/{num}")
    public  int add(@PathVariable("num") int num){
        i=i+num;
        return i;
    }
}
