package com.ypy.suanfa;

import javax.lang.model.util.ElementScanner14;

public class leetcode75 {
    public static void sortColors(int[] nums) {
        //方法一：
        // int num1=0,num2=0,num3=0;
        // for(int i:nums){
        //     if(i==0){
        //         num1++;
        //     }
        //     if(i==1){
        //         num2++;
        //     }
        //     if(i==2){
        //         num3++;
        //     }
        // }
        // for(int i=0;i<nums.length-1;i++){
        //    if(num1>0){
        //        nums[i]=0;
        //        num1--;
        //    }
        //    if(num1==0&num2>0){
        //     nums[i]=1;
        //     num2--;
        //    }
        //    if(num1==0&&num2==0&&num3>0){
        //     nums[i]=2;
        //     num3--;
        //    }


        //方法二
        int p0=0;
        int p1=0;
        int temp;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==2){
            }
            else if(nums[i]==0){

              if(p0<p1){
                temp=nums[p0];
                nums[p0]=nums[i];
                nums[i]=temp;
                temp=nums[p1];
                nums[p1]=nums[i];
                nums[i]=temp;
                }
                else{
              temp=nums[p0];
              nums[p0]=nums[i];
              nums[i]=temp;
                }
              p0=p0+1;
              p1=p1+1;
            }
            else{
                temp=nums[p1];
                nums[p1]=nums[i];
                nums[i]=temp;
                p1=p1+1;

              }

        }

        }


    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        sortColors(nums);
        for(int i:nums){
            System.out.println(i);
        }
    }
}
