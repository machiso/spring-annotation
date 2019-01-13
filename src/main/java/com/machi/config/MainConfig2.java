package com.machi.config;


import com.machi.condition.LinuxCondition;
import com.machi.condition.MyImportSelector;
import com.machi.condition.WindowsCondition;
import com.machi.model.Color;
import com.machi.model.ColorFactoryBean;
import com.machi.model.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

//告诉spring这是一个配置类
@Configuration
@Import({Color.class,MyImportSelector.class})
public class MainConfig2 {

    //Bean 给容器中注册一个bean，类型为返回值的类型，id为方法名
    //lazy:懒加载，是针对单实例来说的。容器启动的时候不会创建对象，而是在对象第一次获取的时候创建对象并初始化。
    @Bean("person")
    @Scope("prototype")
    @Lazy
    public Person person(){
        System.out.println("向spring容器中添加person。。。");
        return new Person("张三",24);
    }

    @Bean("bill")
    @Conditional(WindowsCondition.class)
    public Person person01(){
        return new Person("bill",50);
    }

    @Conditional(LinuxCondition.class)
    @Bean("linux")
    public Person person02(){
        return new Person("linux",60);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
