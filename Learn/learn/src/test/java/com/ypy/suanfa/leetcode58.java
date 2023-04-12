/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-13 12:18:27
 * @LastEditTime: 2021-12-13 12:40:09
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.Scanner;

public class leetcode58 {
    public static int lengthOfLastWord(String s) {
        // int length = 1;
        // int index = 1;
        // while (index <=s.length()-1) {
        //     if (s.charAt(index) - 32 > 0) {
        //         if(s.charAt(index-1)-32==0){
        //             length=0;
        //         }
        //         length++;
        //     }
        //     index++;
        // }
        // return length;




        //第二次
        int i=s.length()-1;
        int count=0;
        while(i>=0){
            if(s.charAt(i)!=' '){
                i--;
                count++;
            }
            else if(s.charAt(i)==' '&&count==0){
                i--;
            }
            else if(s.charAt(i)==' '&&count!=0){
                return count;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        String s="a";
        System.out.println(lengthOfLastWord(s));
        Scanner sc = new Scanner(System.in);//Scanner输入流,从键盘接收数据
        int a = sc.nextInt();
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
