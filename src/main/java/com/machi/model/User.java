package com.machi.model;

import com.machi.annotation.Init;

public class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    @Init(value = "machi")
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    @Init(value = "27")
    public void setAge(String age) {
        this.age = age;
    }
}
