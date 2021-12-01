/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-27 21:40:17
 * @LastEditTime: 2021-12-01 23:47:14
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.没做出来;

public class leetcode26 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int cnt=1;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i-1]){
                cnt++;
            }else{
                nums[i]=nums[i+1];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int len;
        int[] nums = new int[] { 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        len = removeDuplicates(nums);

        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }

    }
}
