/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-13 12:28:36
 * @LastEditTime: 2021-11-13 12:44:35
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.Enumtest;

import javax.management.RuntimeMBeanException;
import com.ypy.Enumtest.MyDate;
public class Employee implements Comparable{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", birthday='" + getBirthday() + "'" +
            "}";
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        if(o instanceof Employee){
            Employee em=(Employee) o;
            return this.name.compareTo(em.name);
        }
        else{
            throw new RuntimeMBeanException(null, "类型错误???");
        }
    }
    

}
