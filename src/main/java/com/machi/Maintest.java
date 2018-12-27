package com.machi;

import com.machi.config.MainConfig;
import com.machi.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Maintest {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person) applicationContext.getBean("person");
//        System.out.println(person);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
//        Person person = applicationContext.getBean(Person.class);
        String[] names = applicationContext.getBeanNamesForType(Person.class);
        for (String name : names){
            System.out.println(name);
        }
//        System.out.println(person);

    }
}
