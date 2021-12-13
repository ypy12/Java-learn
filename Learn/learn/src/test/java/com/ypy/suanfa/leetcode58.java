/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-13 12:18:27
 * @LastEditTime: 2021-12-13 12:40:09
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode58 {
    public static int lengthOfLastWord(String s) {
        int length = 1;
        int index = 1;
        while (index <=s.length()-1) {
            if (s.charAt(index) - 32 > 0) {
                if(s.charAt(index-1)-32==0){
                    length=0;
                }
                length++;
            }
            index++;
        }
        return length;
    }
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-13 12:18:27
 * 
 * @LastEditTime: 2021-12-13 12:18:28
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
