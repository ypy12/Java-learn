/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-24 12:44:52
 * @LastEditTime: 2021-11-24 21:03:27
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class palindrome {
    public static boolean isPalindrome(String s) {
        // 方法一：
        // s = s.replaceAll(" ", "");
        // s = s.toUpperCase();
        // int i = 0;
        // char[] ch = s.toCharArray();
        // for (int j = 0; j < s.length(); j++) {
        // if (ch[j] >= 'A' && ch[j] <= 'Z' || ch[j] >= '0' && ch[j] <= '9') {
        // ch[i] = ch[j];
        // i++;
        // }
        // }
        // for (int j = 0; j < i/2; j++) {
        // if (ch[j]!=ch[i-j-1]) {
        // System.out.println(ch[j]);
        // System.out.println(ch[i-j-1]);

        // return false;
        // }
        // }
        // return true;

        s = s.toUpperCase();
        if (s.isEmpty()) {
            return true;
        }
        char[] ch = s.toCharArray();
        int j = 0;
        int i = ch.length - 1;
        while (j < i) {
            while (!(ch[j] >= 'A' && ch[j] <= 'Z' || ch[j] >= '0' && ch[j] <= '9')&& j<i) {
                j++;
            }
            while (!(ch[i] >= 'A' && ch[i] <= 'Z' || ch[i] >= '0' && ch[i] <= '9')&& j<i) {
                i--;
            }                              
            if (ch[i] != ch[j]) {
                return false;
            } else {
                j++;
                i--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("./"));

    }

}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-24 12:44:52
 * 
 * @LastEditTime: 2021-11-24 12:44:58
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
