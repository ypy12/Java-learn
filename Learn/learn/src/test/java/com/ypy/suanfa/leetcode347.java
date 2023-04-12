package com.ypy.suanfa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class leetcode347 {
    public static int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
      for(int i=0;i<nums.length;i++){
        if(hashmap.containsKey(nums[i])){
            hashmap.put(nums[i], hashmap.get(nums[i])+1);
        }
        else{
            hashmap.put(nums[i],1);
        }
      }

      //小顶堆
      PriorityQueue<int[]> pq = new PriorityQueue<>((pair1,pair2)->pair1[1]-pair2[1]);
      for(Map.Entry<Integer,Integer> entry:hashmap.entrySet()){
         if(pq.size()<k){
            pq.add(new int[]{entry.getKey(),entry.getValue()});
         }
         else{
            if(entry.getValue()>pq.peek()[1]){
                pq.poll();
                pq.add(new int[]{entry.getKey(),entry.getValue()});
            }
         }
      }
         int[] res=new int[k];
         for(int i=0;i<k;i++){
            res[i]=pq.poll()[0];
         }
         return res;
    }
    public static void main(String[] args) {
        int[] k=new int[]{1,1,1,2,2,3};
        int m=2;
        int[] res=topKFrequent(k,m);
        System.out.println(Arrays.toString(res));
        
    }
}
