/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-30 11:16:48
 * @LastEditTime: 2021-11-30 11:42:05
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;



public class leetcode383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        // //方法一
        // Map<Integer, Integer> Notenum = new HashMap<Integer, Integer>();
        // // char[] charnote = ransomNote.toCharArray();
        // // char[] charmagazines = magazine.toCharArray();
        // int count = 0;
        // for (int i=0;i<ransomNote.length();i++) {
        //     count = Notenum.getOrDefault(ransomNote.charAt(i) - 'a', 0) + 1;
        //     Notenum.put(ransomNote.charAt(i) - 'a', count);
        // }
        // for (int i=0;i<magazine.length();i++) {
        //     if (Notenum.containsKey(magazine.charAt(i) - 'a')) {
        //         count = Notenum.get(magazine.charAt(i) - 'a');
        //         Notenum.put(magazine.charAt(i) - 'a', count - 1);
        //     }
        // }

        // for (int i=0;i<ransomNote.length();i++) {
        //       if(Notenum.get(ransomNote.charAt(i) - 'a')>0){
        //           return false;
        //       }
        // }
        // return true;

        //方法二
        int[] numrecord=new int[26];
        for(int i=0;i<magazine.length();i++){
            numrecord[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(numrecord[ransomNote.charAt(i)-'a']>=1){
                numrecord[ransomNote.charAt(i)-'a']--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "aac";
        String magazine = "baac";
        System.out.println(canConstruct(ransomNote,magazine));
    }
}