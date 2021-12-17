/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-17 12:20:48
 * @LastEditTime: 2021-12-17 12:32:26
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode1518 {
    public static int numWaterBottles(int numBottles, int numExchange) {
        return numBottles+(numBottles-1)/(numExchange-1);

    }
    public static void main(String[] args) {
        int k=numWaterBottles(15,4);
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-17 12:20:48
 * 
 * @LastEditTime: 2021-12-17 12:20:48
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
