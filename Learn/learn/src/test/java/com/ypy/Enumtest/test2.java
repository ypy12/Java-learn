/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-12 15:37:12
 * @LastEditTime: 2021-11-12 22:05:01
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.Enumtest;
import com.ypy.Enumtest.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class test2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(123);
        arr1.add(234);
        arr1.add(345);
        // for(Object ar:arr1){
        // System.out.println(ar);
        // }
        arr1.add(456);
        arr1.remove(new Integer(234));
        Iterator iterator = arr1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test() {
        Set set = new HashSet();
        set.add(123);
        set.add(456);
        set.add("fgd");
        set.add("book");
        set.add(new User("Tom", 12));
        set.add(new User("Tom", 12));
        set.add(129);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
