package com.example.demo.entity;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Queue;


public class User {

    private Integer id;

    private String name;

    private String password;

    private String sex;

    private String hobby;

    private int age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", hobby='" + hobby + '\'' +
                ", age=" + age +
                '}';
    }
}
