/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-29 12:56:41
 * @LastEditTime: 2021-12-15 23:08:48
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode387 {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}

/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-29 12:56:41
 * 
 * @LastEditTime: 2021-11-29 12:56:44
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
