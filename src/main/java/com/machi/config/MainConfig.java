package com.machi.config;


import com.machi.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//告诉spring这是一个配置类
@Configuration
public class MainConfig {

    //Bean 给容器中注册一个bean，类型为返回值的类型，id为方法名
    @Bean("person01")
    public Person person(){
        return new Person("张三",24);
    }
}
