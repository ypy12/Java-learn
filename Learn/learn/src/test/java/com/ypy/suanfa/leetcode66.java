/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-11 23:05:23
 * @LastEditTime: 2021-12-11 23:25:30
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.Arrays;

public class leetcode66 {
    public static int[] plusOne(int[] digits) {
      if(digits[digits.length-1]!=9){
          digits[digits.length-1]+=1;
          return digits;
      }
      else{
          digits[digits.length-1]=0;
          for(int i=digits.length-2;i>=0;i--){
              if(digits[i]<9){
                  digits[i]+=1;
                  return digits;
              }
              if(digits[i]==9){
                digits[i]=0;  
                continue;
              }
          }
          int[] result=new int[digits.length+1];
          result[0]=1;
          return result;
      }
    }
    public static void main(String[] args) {
        int[] digits={8,9,9,9};
        int[] result=plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}
/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-11 23:05:23
 * @LastEditTime: 2021-12-11 23:10:14
 * @LastEditors: YPY
 * @Reference: 
 */
