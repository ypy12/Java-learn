/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-13 11:09:48
 * @LastEditTime: 2021-12-13 11:13:08
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode136 {
    public static int singleNumber(int[] nums) {
      int k=0;
      for(int i:nums){
          k^=i;
      }
      return k;
    }
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,3,2,3,4}));
    }
}
/*
 * @Description: 使用异或运算，相同则为0.不同的数字就是单独的数字，而且符合交换律。
 * @Author: YPY
 * @Date: 2021-12-13 11:09:48
 * @LastEditTime: 2021-12-13 11:09:49
 * @LastEditors: YPY
 * @Reference: 
 */
