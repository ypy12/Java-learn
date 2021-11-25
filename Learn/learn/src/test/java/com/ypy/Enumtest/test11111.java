/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-24 11:51:17
 * @LastEditTime: 2021-11-24 11:53:57
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.Enumtest;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class test11111 {
    @Test
    public void test()
    {
        List<List<Integer>> a=new ArrayList<List<Integer>>();
        for(int i=0;i<3;i++)
        {
        List<Integer> b=new ArrayList<Integer>();
        for(int j=0;j<=i;j++)
        {
        b.add(j);
        }
        a.add(b);
        }
        a.get(2).get(0);
        System.out.println(a);
        System.out.println(a.get(1).get(0));

    }

}
