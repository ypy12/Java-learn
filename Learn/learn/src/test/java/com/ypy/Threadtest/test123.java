
/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-10-12 22:00:31
 * @LastEditTime: 2021-10-31 20:07:04
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.Threadtest;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

import java.lang.StringBuilder;

public class test123 {

    public static boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        } else if (x < 0 || x % 10 == 0) {
            return false;
        }

        
        else {
            String s = "" + x;
            for (int i = 0; i < (s.length()+1) / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                    System.out.println(s.charAt(i));
                    System.out.println(s.charAt(s.length()-1-i));
                    return false;
                }

            }
        }
        return true;

    }

    @Test
    public void test1() {
        StringBuffer buf = new StringBuffer("Hard ");

        String aString = "Waxworks";

        buf.append(aString, 3, 5);
        System.out.println(buf);

    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(1000030001));
    }

}
