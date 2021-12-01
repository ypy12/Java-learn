/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-26 22:52:50
 * @LastEditTime: 2021-11-26 23:07:57
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.HashMap;
import java.util.Map;
    
public class leetcode771 {
    public static int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> stone = new HashMap<Character, Integer>();
        int count;;
        int number = 0;
        char[] ch = stones.toCharArray();
        for (char c : ch) {
           count=stone.getOrDefault(c, 0)+1;
           stone.put(c, count);
        }
        char[] ch1=jewels.toCharArray();
        for(char c:ch1){
            number=stone.getOrDefault(c,0)+number;
        }

        return number;
    }
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("z","ZZ"));
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-26 22:52:50
 * 
 * @LastEditTime: 2021-11-26 22:52:50
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
