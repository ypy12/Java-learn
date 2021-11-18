/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-05 23:05:44
 * @LastEditTime: 2021-11-05 23:44:08
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.Threadtest;

public class test5 {
    public static String intToRoman(int num) {
        String str = new String();
        StringBuilder stb = new StringBuilder();
        int num_10=10;
        int num_5=5;
        while (num / 10 > 0) {
            int num1 = num % 10;
             
            num = num / 10;
            

        }

        return null;

    }

    public static String roman(int num) {
        String str = new String();
        switch (num) {
        case 1:
            str = "I";
            break;
        case 5:
            str = "V";
            break;
        case 10:
            str = "X";
            break;
        case 50:
            str = "L";
            break;
        case 100:
            str = "C";
            break;
        case 500:
            str = "D";
            break;
        case 1000:
            str = "M";
            break;
        case 9:
            str = "IX";
            break;
        case 4:
            str = "IV";
            break;
        case 90:
            str = "XC";
            break;
        case 40:
            str = "XL";
            break;
        case 900:
            str = "CM";
            break;
        case 400:
            str = "CD";
            break;
        }
        return str;
    }

    public static void main(String[] args) {
        // String str = intToRoman(864);
        System.out.println(987 % 100);
    }

}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-05 23:05:44
 * 
 * @LastEditTime: 2021-11-05 23:05:45
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
