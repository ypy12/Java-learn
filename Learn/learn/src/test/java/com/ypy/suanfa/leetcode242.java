/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-30 11:44:45
 * @LastEditTime: 2021-11-30 11:57:09
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;



public class leetcode242 {
    public static boolean isAnagram(String s, String t) {
        int[] numrecord = new int[26];
        for (int i = 0; i < s.length(); i++) {
            numrecord[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (numrecord[t.charAt(i) - 'a'] >= 1) {
                numrecord[t.charAt(i) - 'a']--;
            } else {
                return false;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            
            if(numrecord[s.charAt(i) - 'a']!=0){
                return false;
            }
        }
        return true;


    }
    
    public static void main(String[] args) {
        String ransomNote = "aac";
        String magazine = "afdaac";
        System.out.println(isAnagram(ransomNote,magazine));
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-30 11:44:45
 * 
 * @LastEditTime: 2021-11-30 11:44:45
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
