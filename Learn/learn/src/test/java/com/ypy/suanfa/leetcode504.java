package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.platform.commons.util.ToStringBuilder;

public class leetcode504 {
    public static String convertToBase7(int num) {
        StringBuilder s = new StringBuilder();
        int flag=0;
        if(num==0){
            return Integer.toString(0); 
        }
        if (num<0){
            num=Math.abs(num);
            flag=1;
        }

        int num_1 = num%7; // 最低位
        num = num/7; // 剩余位
        s.insert(0, Integer.toString(num_1));
        while(num!=0){
        num_1 = num%7;
        num = num/7;
        s.insert(0,Integer.toString(num_1));
        }
        if(flag==1){
            s.insert(0,'-');
        }
        return s.toString();
    }
    public static void main(String[] args) {
        int num=-7;
        String s=convertToBase7(num);
        System.out.println(s);
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
      
    }
}
