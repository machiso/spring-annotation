package com.machi.model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog {

    public Dog() {
        System.out.println("dog construtor....");
    }

    @PostConstruct
    public void init(){
        System.out.println("dog PostConstruct...");
    }

    @PreDestroy
    public void destory(){
        System.out.println("dog destory...");
    }
}
