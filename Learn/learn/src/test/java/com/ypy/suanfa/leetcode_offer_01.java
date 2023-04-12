package com.ypy.suanfa;

import javax.lang.model.util.ElementScanner14;

public class leetcode_offer_01 {
    public static int fib(int n) {
        int[] result=new int[n+1];
         result[0] = 0;
         result[1] = 1;

        if(n>=2){
          for(int i=2;i<=n;i++){
            result[i]=result[i-1]+result[i-2];
            result[i] = result[i] % 1000000007;
          }
        }
  
      return result[n];
    }

    public static void main(String[] args) {
        int n=43;
        int k=fib(n);
        System.out.println(k);
    }
}
