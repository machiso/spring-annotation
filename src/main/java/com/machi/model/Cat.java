package com.machi.model;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


/**
 * InitializingBean:定义初始化逻辑
 * DisposableBean：定义销毁逻辑
 */
@Component
public class Cat implements InitializingBean,DisposableBean {
    public Cat() {
        System.out.println("cat construstor....");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Cat destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat afterPropertiesSet");
    }
}
