/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-06 11:00:14
 * @LastEditTime: 2021-12-06 11:15:04
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode1816 {
    public static String truncateSentence(String s, int k) {
        // StringBuffer ls=new StringBuffer(s);
        s=s+' ';
        int endindex=0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' '&&k>0) {
                    endindex=i;
                    --k;
                }
            }

        return s.substring(0, endindex);
    }
    public static void main(String[] args) {
        String s ="chopper is not a tanuki";
        String m=truncateSentence(s, 5);
        System.out.println(m);
    }
}
