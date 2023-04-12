/*
 * @Description: 
 * @Author: YPY
 * @Date: 2022-02-22 13:12:46
 * @LastEditTime: 2022-02-22 14:24:54
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.HashMap;
import java.util.Map;

public class leetcode169 {
    // 方法一
    // public static int majorityElement(int[] nums) {
    // int count;
    // int maxcount=0;
    // int maxcount_num=nums[0];
    // Map<Integer, Integer> number = new HashMap<Integer, Integer>();
    // for (int num : nums) {
    // count = number.getOrDefault(num, 0) + 1;
    // number.put(num, count);
    // if (count > maxcount) {
    // maxcount = count;
    // maxcount_num=num;
    // }
    // }

    // return maxcount_num;

    // }

    // 方法二:摩尔投票法，最多的和其他不同的相抵消
    public static int majorityElement(int[] nums) {
        int candidate = -1;
        int cnt = 0;
        for (int num : nums) {
            if (cnt == 0) {
                candidate = num;
                cnt++;
            } else if (num == candidate) {
                cnt++;
            } else if (num != candidate) {
                cnt--;
            }
        }
        return candidate;
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
