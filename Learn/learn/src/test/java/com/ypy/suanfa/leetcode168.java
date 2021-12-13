/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-13 11:15:54
 * @LastEditTime: 2021-12-13 11:38:18
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode168 {
    public static String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        while (columnNumber != 0) {
            Character ch;
            if (columnNumber % 26 == 0) {
                columnNumber-=26;
                ch = 'Z';
            } else {
                ch = (char) ('A' + columnNumber % 26 - 1);
            }
            str.append(ch);
            columnNumber /= 26;
        }
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        int c = 28;
        System.out.println(convertToTitle(701));
    }
}
