package com.ypy.suanfa;

import java.util.Scanner;

public class leetcode1108 {
    public static String defangIPaddr(String address) {
      StringBuilder s= new StringBuilder(address);
      String in = new String("[.]");
      for(int i = 0;i<s.length();i++){
       if(s.charAt(i)=='.'){
        s.delete(i, i+1);
        s.insert(i, in);
        i=i+2;
       }
      }
      return s.toString();
    }
    public static void main(String[] args) {
        String s=defangIPaddr(new String("1.1.1.1"));
        System.out.println(s);
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
      
    }
}
