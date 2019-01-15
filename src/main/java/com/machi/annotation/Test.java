package com.machi.annotation;

import com.machi.model.User;

public class Test {
    public static void main(String[] args) {
        User user = UserFactory.create();
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }
}
