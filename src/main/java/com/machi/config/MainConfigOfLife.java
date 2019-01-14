package com.machi.config;

import com.machi.model.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * bean生命周期:bean创建-》 初始化 -》 销毁
 * 由容器管理，我们可以自定义bean的初始化和销毁方法
 * 1、制定初始化和销毁方法
 */
@Configuration
@ComponentScan("com.machi")
public class MainConfigOfLife {

    @Bean(initMethod = "init",destroyMethod = "destory")
//    @Scope("prototype")
    public Car car(){
        return new Car();
    }

}
