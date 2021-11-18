/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-10-31 20:08:00
 * @LastEditTime: 2021-10-31 21:05:41
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.Threadtest;

import java.util.Arrays;

public class test2 {

    public static String longestCommonPrefix(String[] strs) {
        // int k = 0;
        // char[] ch_match = new char[strs[1].length()];
        // for (int i = 1; i < strs.length; i++) {
        //     char[] ch1 = new char[strs[i].length()];
        //     ch1 = strs[i].toCharArray();
        //     char[] ch2 = new char[strs[i - 1].length()];
        //     ch1 = strs[i - 1].toCharArray();
        //     System.out.println(ch1);
        //     System.out.println(ch2);
        //     int j = 0;
        //     while (ch1[j] == ch_match[j]) {
        //         ch_match[j] = ch1[j];
        //         j++;
        //     }
        //     ch_match.toString()
        //     System.out.println();
        // }
        // return ch_match.toString();
        if (strs.length == 0) {
            return "";
        }
        // 字典排序
        Arrays.sort(strs);
        for(String str:strs){
             System.out.println(str);
        }
       
        // 取排序后第一个串
        String startStr = strs[0];
        // 取最后一个串与第一个串进行比较，取他们两个都有的公共前缀为最终结果
        while (!strs[strs.length - 1].startsWith(startStr)) {
            startStr = startStr.substring(0, startStr.length() - 1);
        }

        return startStr;
    }

    public static void main(String[] args) {
        String[] strs = {"strsin","aipost","strshz","aiget" ,"strshza"};
        String str = longestCommonPrefix(strs);
        System.out.println(str.toString());
    }

}
