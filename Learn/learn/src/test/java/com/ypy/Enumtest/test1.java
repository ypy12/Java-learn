package com.ypy.Enumtest;
/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-12 12:05:34
 * @LastEditTime: 2021-11-12 12:15:18
 * @LastEditors: YPY
 * @Reference: 
 */

public class test1 {

    public static void main(String[] args) {
        Season spring=Season.SPRING;
        System.out.println(spring.toString());
    }
}

class Season {
    private final String seasonname;
    private final String seasondoc;

    private Season(String seasonname, String seasondoc) {
        this.seasonname = seasonname;
        this.seasondoc = seasondoc;
    }

    public static final Season SPRING = new Season("春天", "四季如春");
    public static final Season SUMMER = new Season("夏天", "烈日炎炎");
    public static final Season AUNTUM = new Season("秋天", "秋风飒爽");
    public static final Season WINTER = new Season("冬天", "冰天雪地");

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "季节" + this.seasonname + "情景" + this.seasondoc;
    }
}