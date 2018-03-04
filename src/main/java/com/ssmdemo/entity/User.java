package com.ssmdemo.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @program: ssmdemo06
 * @description: user表对应的实体类
 * @author: Mr.Wang
 * @create: 2018-03-01 16:24
 **/

@Component(value = "user")
@Scope(value = "prototype")
public class User {

    private int id;
    private String name;
    private String password;

    public User(){

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
