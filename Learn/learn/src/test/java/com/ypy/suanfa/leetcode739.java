/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-18 22:58:03
 * @LastEditTime: 2021-12-18 23:31:30
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.Arrays;
import java.util.Stack;

public class leetcode739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        if (temperatures.length == 1) {
            temperatures[0] = 0;
            return temperatures;
        }
        int[] result = new int[temperatures.length];
        int index = 0;
        Stack<Integer> tempstack = new Stack<Integer>();
        tempstack.push(temperatures[0]);
        for (int i = 1; i < temperatures.length - 1; i++) {
            if ((tempstack.peek() >= temperatures[i])) {
                tempstack.push(temperatures[i]);
                result[index] = 0;
                index++;
            } else {
                int m = 0;
                while (!tempstack.isEmpty()&&tempstack.peek() < temperatures[i]) {
                    m++;
                    result[index] = m;
                    tempstack.pop();
                }
                index++;
                tempstack.push(temperatures[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] t = new int[] { 73, 74, 75, 71, 69, 72, 76, 73 };
        System.out.println(Arrays.toString(dailyTemperatures(t)));
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-18 22:58:03
 * 
 * @LastEditTime: 2021-12-18 22:58:03
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
