/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-10-31 21:16:06
 * @LastEditTime: 2021-10-31 22:03:55
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.Threadtest;

public class test4 {
    public static int trim(String str, String str1) {
          int count=0;
          while(str.indexOf(str1)!=-1){
              str=str.substring(str.indexOf(str1)+str1.length());
              System.out.println(str);
              count++;
              System.out.println(count);
          }
          return count;
    }

    public static void main(String[] args) {
        System.out.println(trim("adfjaldkjfaldkjjfiefadfacmkjadjfa", "kj"));
    }

}
