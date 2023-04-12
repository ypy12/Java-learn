// package com.ypy.suanfa;

// import java.util.HashMap;
// import java.util.Map;

// public class leetcode1 {
//     public int[] twosums(int[] nums, int target) {
//         Map<Integer,Integer> hashtable=new HashMap<Integer,Integer>();
//         for(int i=0;i<nums.length;++i){
//             if(hashtable.containsKey(target-nums[i])){
//                return new int[]{hashtable.get(target - nums[i]), i};
//                }
//                hashtable.put(nums[i],i);
   
//         }
//         return new int[0];
//        }

//        public static void main(String[] args) {
//        int[] nums = {2,7,11,15};
//         int target = 9;
//         sortColors(nums);
//         for(int i:nums){
//             System.out.println(i);
//         }
//     }
// }
