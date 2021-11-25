/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-24 11:12:55
 * @LastEditTime: 2021-11-24 12:44:28
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.List;

public class YangTriangle1 {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            if (i == 0) {
                row.add(1);
            }
            else{
                List<Integer> prerow=triangle.get(i-1);
                for(int j=0;j<i+1;j++){
                    if(j==0||j==i){
                        row.add(1);
                    }
                    else{
                        row.add(prerow.get(j)+prerow.get(j-1));
                    }
                }
                
            }
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        System.out.println(generate(3));
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-24 11:12:55
 * 
 * @LastEditTime: 2021-11-24 11:12:56
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
