/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-25 11:08:38
 * @LastEditTime: 2021-11-25 12:05:15
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;


import java.util.Arrays;


public class leetcode88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 方法一
        // int i = 0;
        // while (i < n) {
        // for (int j = m; j < m + n; j++) {
        // nums1[j] = nums2[i];
        // i++;
        // }
        // }
        // Arrays.sort(nums1);

        // 方法二
        // System.arraycopy(nums2, 0, nums1, m, n);
        // Arrays.sort(nums1);
        // System.out.println(Arrays.toString(nums1));

        // 方法三
        int[] num = new int[m + n];
        int k = 0;
        for (int i = 0; i < m - n; i++) {
            for (int j = 0; j < n; j++) {
                // nums1[i]<nums2[j]?(num[k]=nums1[i],i++):(num[k]=nums2[j],j++);

                if (nums1[i] <= nums2[j]) {

                    num[k] = nums1[i];
                    System.out.println("------");
                    i++;
                } else {

                    num[k] = nums2[j];
                    j++;
                }
                k++;
            }
        }
        System.out.println(Arrays.toString(num));

    }

    public static void main(String[] args) {
        int[] num1 = { 1, 2, 3, 0, 0, 0 };
        int[] num2 = { 2, 5, 6 };
        merge(num1, 3, num2, 3);
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
    }
}
