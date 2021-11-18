/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-13 15:15:59
 * @LastEditTime: 2021-11-13 15:33:00
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.file;

import java.io.File;

public class filetest1 {
    public static void main(String[] args) {
        File file = new File("D:\\代码");

        File[] src = file.listFiles();
        for (File i : src) {
            if (i.getName().endsWith(".m")) {
                System.out.println(i.getName());
            }

        }
    }
}
