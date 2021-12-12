/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-12 22:20:20
 * @LastEditTime: 2021-12-12 22:40:45
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode171 {
    public static int titleToNumber(String columnTitle) {
        int num=0;
        int multiple=1;
        for(int i=columnTitle.length()-1;i>=0;i--){
            int d=(columnTitle.charAt(i)-'A'+1);
            num += d * multiple;
            multiple *= 26;

      }
      return num;
    }
    public static void main(String[] args) {
        String c="AB";
        System.out.println(titleToNumber(c));
    }
}
/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-12 22:20:20
 * @LastEditTime: 2021-12-12 22:20:20
 * @LastEditors: YPY
 * @Reference: 
 */
