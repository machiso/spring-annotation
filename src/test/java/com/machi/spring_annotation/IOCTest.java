package com.machi.spring_annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class IOCTest {

    @Test
    public void test01(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }
    }
}
