package com.ypy.Enumtest;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-13 11:37:18
 * @LastEditTime: 2021-11-13 12:27:19
 * @LastEditors: YPY
 * @Reference: 
 */
import com.ypy.Enumtest.*;

public class treesettest {

    static Comparator com = new Comparator() {
        public int compare(Object o1, Object o2) {
            if (o1 instanceof User && o2 instanceof User) {
                User u1 = (User) o1;
                User u2 = (User) o2;
                return Integer.compare(u1.getAge(), u2.getAge());
            } else {
                throw new RuntimeException("输入的数据类型不匹配");
            }
        }

    };

    public static void main(String[] args) {
        TreeSet set = new TreeSet(com);
        set.add(new User("TIM", 15));
        set.add(new User("T0M", 14));
        set.add(new User("T9M", 13));
        set.add(new User("T8M", 12));
        set.add(new User("T7M", 11));
        set.add(new User("TIM", 15));
        // set.add(123);
        // set.add(231);
        // set.add(-231);
        // set.add(897);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}