/*
 * @Description: 
 * @Author: YPY
 * @Date: 2022-02-22 13:12:46
 * @LastEditTime: 2022-02-22 13:33:43
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.HashMap;
import java.util.Map;

public class leetcode169 {
    public static int majorityElement(int[] nums) {
        if(nums==null){
            return 0;
        }
        int count;
        int maxcount=0;
        int maxcount_num=nums[0];
        Map<Integer, Integer> number = new HashMap<Integer, Integer>();
        for (int num : nums) {
            count = number.getOrDefault(num, 0) + 1;
            number.put(num, count);
            if (count > maxcount) {
                maxcount = count;
                maxcount_num=num;
            }
        }

        return maxcount_num;

    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }

}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2022-02-22 13:12:46
 * 
 * @LastEditTime: 2022-02-22 13:13:31
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
