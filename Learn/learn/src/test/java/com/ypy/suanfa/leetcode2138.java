package com.ypy.suanfa;

import java.util.Scanner;

public class leetcode2138 {
    public static String[] divideString(String s, int k, char fill) {
        int num=s.length()/k; //定义数组的个数，因为是向下取整
        int fill_num=s.length()%k;//判断是否需要填充
        if(fill_num!=0){   
           num = num+1;   //如果还有剩余的字符串，所以要填充和数组加一
        }
        fill_num=k-fill_num;//需要填充的个数
        String[] result = new String[num];
        int num_index = 0;
        StringBuilder s_new=new StringBuilder(s);
        for(int i=0;i<fill_num;i++){
            s_new.append(fill);
        }
        while(num_index < num  ){
            result[num_index]=s_new.substring(k*num_index, k*(num_index+1));
            num_index++;
        }
        return result;
    }
    public static void main(String[] arg) {
       String s = "abcdefghij";
       String[]  result =divideString(s, 3, 'x');
       Scanner sc= new Scanner(System.in);
       int a =sc.nextInt();
        
    }
}
