package com.machi.spring_annotation;

import com.machi.config.MainConfig;
import com.machi.config.MainConfig2;
import com.machi.model.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class IOCTest {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);

    @Test
    public void import1(){
        String[] names = context.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }
        Object bean = context.getBean("colorFactoryBean");
        System.out.println("bean的类型："+bean.getClass());
    }

    @Test
    public void test01(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }
    }

    /**
     * ComponentScan
     */
    @Test
    public void test02(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names){
            System.out.println(name);
        }
    }

    /**
     * scope测试
     */
    @Test
    public void test03(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println("ioc容器创建完成");
        Person person = context.getBean(Person.class);
        Person person2 = context.getBean(Person.class);
        System.out.println(person == person2);
    }

    /**
     * conditional测试
     */
    @Test
    public void conditional(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println(context.getEnvironment().getProperty("os.name"));
        String[] names = context.getBeanNamesForType(Person.class);
        for (String name : names){
            System.out.println(name);
        }
    }
}
