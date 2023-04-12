/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-24 21:08:26
 * @LastEditTime: 2021-12-01 13:53:48
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.Arrays;
import java.util.Scanner;



public class leetcode217 {
    public static boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
        int size=nums.length;
        if(size<=1){
            return false;
        }
        for(int i=1;i<size;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] num={4,6,3,5,2,4,6,7};
        System.out.println(containsDuplicate(num));
        Scanner sc = new Scanner(System.in);//Scanner输入流,从键盘接收数据
        int a = sc.nextInt();
    }
}
