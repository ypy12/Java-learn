/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-26 17:44:29
 * @LastEditTime: 2021-11-26 21:02:57
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode121 {
    public static int maxProfit(int[] prices) {

        // 超时，暴力求解，时间复杂度为O(N*N)
        // int max = 0;

        // for (int price_buy = 0; price_buy < prices.length; price_buy++) {
        // for (int price_sell = price_buy + 1; price_sell < prices.length;
        // price_sell++) {
        // if(prices[price_sell]>prices[price_buy]){
        // max=Math.max(max, prices[price_sell]-prices[price_buy]);
        // }
        // }
        // }
        // return max;

        int max=0;
        int min_price=prices[0];
        for(int i=1;i<prices.length;i++){
            
             max=Math.max(max, prices[i]-min_price);
             if(prices[i]<min_price){
                 min_price=prices[i];
             }
             
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,1,5,3,6,4 }));
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-26 17:44:29
 * 
 * @LastEditTime: 2021-11-26 17:46:03
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
