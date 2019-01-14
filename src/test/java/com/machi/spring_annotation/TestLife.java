package com.machi.spring_annotation;

import com.machi.config.MainConfigOfLife;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLife {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfLife.class);
        System.out.println("容器初始化完成");
        Object car = context.getBean("car");
        context.close();
    }

    @Test
    public void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfLife.class);
        System.out.println("容器初始化完成");
//        Object car = context.getBean("car");
        context.close();
    }
}
