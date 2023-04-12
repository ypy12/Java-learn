package com.ypy.suanfa;

import java.util.concurrent.atomic.AtomicBoolean;

import javax.print.attribute.PrintRequestAttribute;

public class leetcode334 {
    public static void reverseString(char[] s) {
        int pre=0;
        int after=s.length-1;
        char temp;
        while(pre<after){
            temp=s[after];
            s[after]=s[pre];
            s[pre]=temp;
            after=after-1;
            pre=pre+1;
        }
    }
    public static void mian() {
        char[] s=new char[]{'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);

    }
}
