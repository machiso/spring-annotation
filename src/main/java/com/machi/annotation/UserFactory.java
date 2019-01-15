package com.machi.annotation;

import com.machi.model.User;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserFactory {

    public static User create(){
        User user = new User();
        Method[] methods = user.getClass().getMethods();

        try {
            for (Method method : methods){
                if (method.isAnnotationPresent(Init.class)){
                    Init init = method.getAnnotation(Init.class);
                    method.invoke(user,init.value());
                }
            }
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return user;
    }

}
