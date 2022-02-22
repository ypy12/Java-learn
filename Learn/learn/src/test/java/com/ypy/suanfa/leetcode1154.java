/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-28 22:14:40
 * @LastEditTime: 2021-12-28 23:00:27
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.sql.Date;
import java.text.Format;
import java.time.DayOfWeek;

public class leetcode1154 {
    public static int dayOfYear(String date) {
        int monthday[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int countday = 0;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            monthday[1] = 29;
        }
        for(int i=0;i<=month-2;i++){
            countday=monthday[i]+countday;
        }

        return countday+day;
    }

    public static void main(String[] args) {
        String date = "2019-02-10";
        System.out.println(dayOfYear(date));
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-28 22:14:40
 * 
 * @LastEditTime: 2021-12-28 22:26:38
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
