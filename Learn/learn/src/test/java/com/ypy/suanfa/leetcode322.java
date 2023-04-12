package com.ypy.suanfa;

import java.util.Arrays;
import java.util.Scanner;

public class leetcode322 {
    public static int coinChange(int[] coins, int amount) {
       //先排除特殊情况
       if(amount==0){
        return 0;
       }
       Arrays.sort(coins);
       int i=coins.length-1;
       int sum_num=0;
       int residual_amout=amount;
       while(residual_amout!=0&&i>=0){
        int num=residual_amout/coins[i];
        if(num!=0){
            sum_num=sum_num+num;
            residual_amout=residual_amout-num*coins[i];
        }
        i--;
       }
       if (residual_amout==0) {
        return sum_num;}
       else {return -1;}
    }
    public static void main(String[] args) {
        int[] coins = {186,419,83,408};
        int a=coinChange(coins,6249);
        System.out.println(a);
        Scanner sc= new Scanner(System.in);
        int b =sc.nextInt();
      
    }
}
