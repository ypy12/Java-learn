/*
 * @Description:二分法 
 * @Author: YPY
 * @Date: 2021-12-11 22:35:46
 * @LastEditTime: 2021-12-11 23:02:48
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode35 {
    public static int searchInsert(int[] nums, int target) {

        if (nums[0] >= target) {
            return 0;
        }
        if (nums[nums.length - 1] <= target) {
            return nums.length;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                high = mid - 1;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            }
            if (nums[mid] == target) {
                return mid;
            }
        }
        return high + 1;
    }

    public static void main(String[] args) {
        int[] nums = { 1 ,2};
        int k = searchInsert(nums, 7);
        System.out.println(k);

    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-11 22:35:46
 * 
 * @LastEditTime: 2021-12-11 22:35:47
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
