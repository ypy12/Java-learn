/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-13 13:09:55
 * @LastEditTime: 2021-12-13 13:19:51
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode28 {
    public int strStr(String haystack, String needle) {
        // API方法
        // return haystack.indexOf(needle);
        if (needle == null) {
            return 0;
        }
        int index = 0;
        for (int i = 0; i < haystack.length() - 1; i++) {
            if (haystack.charAt(i) == needle.charAt(index)) {
                index++;
                if (index == needle.length() - 1) {
                    return i - needle.length() + 1;
                }
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
 * @Date: 2021-12-13 13:09:55
 * 
 * @LastEditTime: 2021-12-13 13:09:55
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
