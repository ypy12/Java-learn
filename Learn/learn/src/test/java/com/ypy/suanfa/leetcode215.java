/*
 * @Description: 
 * @Author: YPY
 * @Date: 2022-01-10 23:04:50
 * @LastEditTime: 2022-01-10 23:06:46
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.Scanner;

public class leetcode215 {
    public static int findKthLargest(int[] nums, int k) {
          quick_sort(nums, 0, nums.length-1);
          return nums[nums.length-1-k];
    }
   public static void quick_sort(int[] nums,int low,int high) {
       int left=low;
       int right=high;
       int temp=nums[low];
       while(left<right){
        while(nums[right]>temp){
            right--;
        }
        while(nums[left]<temp){
            left++;
        }
        if(nums[right]<nums[left]){
            int temp1=nums[right];
            nums[right]=nums[left];
            nums[left]=temp1;
        }
        nums[low]=nums[left];
        nums[left]=temp;
       }
       quick_sort(nums,low,left-1);
       quick_sort(nums, left+1, high);
   }

    public static void main(String[] args) {
        int[] nums={3,2,3,1,2,4,5,5,6};
        int k=4;
        System.out.println(findKthLargest(nums, k));
        Scanner sc = new Scanner(System.in);//Scanner输入流,从键盘接收数据
        int a = sc.nextInt();
    }
}
