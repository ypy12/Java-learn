/*
 * @Description: 
 * @Author: YPY
 * @Date: 2022-02-22 14:42:41
 * @LastEditTime: 2022-02-22 20:39:52
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        // Arrays.sort(nums);
        // List<List<Integer>> result = new ArrayList<>();
        // // 空和全负，全正都不可能找到
        // if (nums == null || nums.length < 3 || nums[nums.length - 1] < 0 || nums[0] >
        // 0) {
        // return result;
        // }
        // if (nums[1] == nums[2] && nums[0] == nums[1] && nums[1] == 0) {
        // List<Integer> num1 = new ArrayList<Integer>();
        // num1.add(0);
        // num1.add(0);
        // num1.add(0);
        // result.add(num1);
        // return result;
        // }
        // // 找到负数和正数的零界点
        // int index = 0;
        // for (int i = 0; i < nums.length - 1; i++) {
        // if (nums[i] <= 0 && nums[i + 1] >= 0) {
        // index = i;
        // }
        // }

        // int numa;
        // int numb;
        // int numc;

        // for (int i = 0; i < nums.length-1; i++) {
        // numa = nums[i];
        // if(numa>0){break;}
        // if (nums[i] == nums[i+1] && nums[i] == nums[i+2] && nums[i] == 0) {
        // List<Integer> num1 = new ArrayList<Integer>();
        // num1.add(0);
        // num1.add(0);
        // num1.add(0);
        // result.add(num1);
        // return result;
        // }

        // for (int m = index+1; m <= nums.length - 1; m++) {
        // numb = nums[m];
        // numc = 0 - numa - numb;
        // if (numc > 0) {
        // for (int k = m + 1; k <= nums.length - 1; k++) {
        // if (nums[k] == numc) {
        // List<Integer> num1 = new ArrayList<Integer>();
        // num1.add(numa);
        // num1.add(numb);
        // num1.add(numc);
        // if (result.contains(num1)) {
        // break;
        // } else {
        // result.add(num1);
        // break;
        // }
        // }
        // }
        // } else {
        // for (int k = i + 1; k < nums.length - 1; k++) {
        // if (nums[k] == numc) {
        // List<Integer> num1 = new ArrayList<Integer>();
        // num1.add(numa);
        // num1.add(numb);
        // num1.add(numc);
        // if (result.contains(num1)) {
        // break;
        // } else {
        // result.add(num1);
        // break;
        // }
        // }
        // }
        // }
        // }

        // }

        // 参考后修改
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        // 空和全负，全正都不可能找到
        if (nums == null || nums.length < 3 || nums[nums.length - 1] < 0 || nums[0] > 0) {
            return result;
        }
        int a, b, c;
        c = nums.length - 1;
        for (a = 0; a < nums.length - 1; a++) {
            if (nums[a] > 0) {
                break;
            }
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            c = nums.length - 1;
            for (b = a + 1; b < c; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) {
                    continue;
                }
                while (b < c && nums[b] + nums[c] > (-nums[a])) {
                    c--;
                }
                if (b == c) {
                    break;
                }
                if (nums[b] + nums[c] == (-nums[a])) {
                    List<Integer> num1 = new ArrayList<Integer>();
                    num1.add(nums[a]);
                    num1.add(nums[b]);
                    num1.add(nums[c]);
                    result.add(num1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        System.out.println(threeSum(nums));
    }
}
