/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-26 11:08:02
 * @LastEditTime: 2021-11-26 17:42:53
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;


import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;


public class leetcode350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
     //正确方法一：
        // int k = 0;
        // List<Integer> num1 = new ArrayList<>();
        // List<Integer> num2 = new ArrayList<>();

        // for (int i : nums1) {
        //     num1.add(i);

        // }
        // for (int num : nums2) {
        //     if (num1.contains(num)) {
        //         num2.add(num);
        //         num1.remove(num);

        //     }
        // }
        // int[] result = new int[num2.size()];
        // for (int num : num2) {
        //     result[k] = num;
        //     k++;
        // }
        // return result;

        // 尝试一：
        // int k = 0;
        // Set num1 = new HashSet<>();
        // if (nums1.length >= nums2.length) {
        // for (int i : nums1) {
        // num1.add(i);
        // }
        // for (int i = 0; i < nums2.length; i++) {
        // if (!num1.add(nums2[i])) {
        // nums2[k] = nums2[i];
        // num1.remove(nums2[i]);
        // k++;
        // }
        // }

        // return Arrays.copyOf(nums2, k);
        // }
        // else{
        // for (int i : nums2) {
        // num1.add(i);
        // }
        // for (int i = 0; i < nums1.length; i++) {
        // if (!num1.add(nums1[i])) {
        // nums1[k] = nums1[i];
        // num1.remove(nums1[i]);
        // k++;
        // }
        // }

        // return Arrays.copyOf(nums1, k);
        // }


        //官方答案
        //保证用最小的那一段来建立MAP会减小内存消耗
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //把MAP建立成为一个KEY为数值，Value为出现次数的
        for (int num : nums1) {
            //绝绝子，getorDefault方法可以在map中找KEY为num的，找得到说明num的出现次数又要加以，没有出现过默认值是0，再加一，出现过一次。
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                intersection[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }

    public static void main(String[] args) {

        int[] num1 = { 1, 2, 2, 1 };
        int[] num2 = { 2, 2 };
        System.out.println(Arrays.toString(intersect(num1, num2)));
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-26 11:08:02
 * 
 * @LastEditTime: 2021-11-26 11:14:13
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
