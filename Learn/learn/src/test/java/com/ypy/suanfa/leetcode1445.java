/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-01 22:19:24
 * @LastEditTime: 2021-12-01 23:22:25
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode1445 {
    public static int maxPower(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int max = 1;
        int cnt = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                cnt++;
                max=Math.max(max, cnt);
            }else{
                cnt=1;
            }
            
        }return max;
    }

    public static void main(String[] args) {
        System.out.println(maxPower("abfdeeeee"));
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-01 22:19:24
 * 
 * @LastEditTime: 2021-12-01 22:19:28
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
