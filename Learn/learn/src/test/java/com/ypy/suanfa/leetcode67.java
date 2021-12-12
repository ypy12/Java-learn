/*
 * @Description: 
     * @Author: YPY
 * @Date: 2021-12-11 23:29:11
 * @LastEditTime: 2021-12-12 22:16:17
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.Arrays;

public class leetcode67 {
    public static String addBinary(String a, String b) {
        if (b.length() > a.length()) {
            String t = a;
            a = b;
            b = t;
        }

        while (b.length() < a.length()) {
            b = "0" + b;
        }

        StringBuilder stringBuilder = new StringBuilder();
        int plus = 0;

        // 字符串相加
        for (int i = a.length() - 1; i >= 0; i--) {
            // 拿到相应数位上的数字值
            int a_c = a.charAt(i) - '0';
            int b_c = b.charAt(i) - '0';

            int temp = a_c + b_c + plus;
            if (temp >= 2) {
                temp = temp % 2;
                plus = 1;
            } else {
                plus = 0;
            }

            stringBuilder.append(temp);
        }

        // 加到最后还有进位
        if (plus == 1) {
            stringBuilder.append(1);
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1110110101";

        String b = "1110111011";
        String c = addBinary(a, b);
        System.out.println(c);
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-11 23:29:11
 * 
 * @LastEditTime: 2021-12-11 23:29:11
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
