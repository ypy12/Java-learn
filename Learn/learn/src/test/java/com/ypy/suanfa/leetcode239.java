package com.ypy.suanfa;

public class leetcode239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
         int L = nums.length;
         int[] num_max = new int[L-k+1];
         int index=0;
         int num_re=0;
         while(index+k<=nums.length-1){
          if(index==0){
            num_max[0]=0;
          for(int i=0;i < k; i++ ){
             num_max[index]=nums[index+i]+num_max[index];
          }
          num_re=num_max[index]-nums[index];
          index=index+1;
        }
        else{
            num_max[index]=num_re+num_max[index+k-1];
            num_re=num_max[index]-nums[index];
            index=index+1;
        }
            
         }
         return num_max;

    }

    public static void main(String[] arg) {
        System.out.println("hello world");
       int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
       int k = 3;
       nums=maxSlidingWindow(nums,k);
       int m=nums.length-1;
       for(int i=0;i<m;i++){
        System.out.println(nums[i]);
       }
    }
}
