/*
 * @Description: 第一次修改：将枚举类改为用enum方法
 * @Author: YPY
 * @Date: 2021-10-22 20:47:00
 * @LastEditTime: 2021-11-12 13:30:25
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.service;
//枚举类的用法
/* public class Status {
    private final String NAME;

    private Status(String name) {
        this.NAME = name;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status VOCATION = new Status("VOCATION");
    public static final Status BUSY = new Status("BUSY");

    public String getName() {
        return this.NAME;
    }

    public String toString() {
        return this.NAME;
    }

} */

public enum Status{
    FREE,BUSY,VOCATION;
}