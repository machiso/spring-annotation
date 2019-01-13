package com.machi.config;


import com.machi.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;

//告诉spring这是一个配置类
@Configuration
@ComponentScan(value = "com.machi",useDefaultFilters = true,excludeFilters = {
    @ComponentScan.Filter(type = FilterType.ANNOTATION,value = Service.class)
})
public class MainConfig {

    //Bean 给容器中注册一个bean，类型为返回值的类型，id为方法名
    @Bean("person01")
    public Person person(){
        return new Person("张三",24);
    }
}
