package com.itheima.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: SongJunHui
 * email:1097772818@qq.com
 * blog: https://blog.csdn.net/s4742488
 * @Date: 2019/5/26 19:19
 */
@Component
public class User {
    @Value("宋俊辉")
   private   String name;

    @Value("18")
   private  int age;

    public User() {
        System.out.println(this.age);
        System.out.println(this.name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
