/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-11 22:11:13
 * @LastEditTime: 2021-12-11 22:32:49
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.logging.LoggingPermission;

public class leetcode14 {
    public static String longestCommonPrefix(String[] strs) {
        int index_str=0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < strs[index_str].length()) {
               index_str=i;
            }
        }
        for(int k=strs[index_str].length();k>0;k--){
            String str=strs[index_str].substring(0,k);
            int i=0;
            while(i<strs.length){
                if(!strs[i].startsWith(str)){
                    break;
                }
                if(i==strs.length-1){
                  return str;
                }
                i++;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        String str=longestCommonPrefix(strs);
        System.out.println(str);
    }
}
