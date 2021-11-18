package com.ypy.Enumtest;
/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-12 21:57:37
 * @LastEditTime: 2021-11-13 12:24:22
 * @LastEditors: YPY
 * @Reference: 
 */

import java.util.Objects;

import javax.management.RuntimeErrorException;

public class User implements Comparable {

    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name) && age == user.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof User) {
            User user = (User) o;

            return this.name.compareTo(user.name);
        }
else{
    throw new RuntimeErrorException(null, "类型错误");
}
    }
}
