/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-13 12:33:51
 * @LastEditTime: 2021-11-13 14:16:01
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.Enumtest;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.ypy.Enumtest.Employee;

public class testem {
    static Comparator com = new Comparator() {
        public int compare(Object o1, Object o2) {
            if (o1 instanceof Employee & o2 instanceof Employee) {
                Employee e1 = (Employee) o1;
                Employee e2 = (Employee) o2;

                MyDate b1 = e1.getBirthday();
                MyDate b2 = e2.getBirthday();
                   //比较年
                   int minusYear = b1.getYear() - b2.getYear();
                   if(minusYear != 0){
                       return minusYear;
                   }

                   //比较月
                   int minusMonth = b1.getMonth() - b2.getMonth();
                   if(minusMonth != 0){
                       return minusMonth;
                   }

                   //比较日
                   return b1.getDay() - b2.getDay();

            }
            else{
                throw new RuntimeException("输入类型错误");
            }
        }
    };

    public static void main(String[] args) {
        TreeMap emset = new TreeMap(com);
        emset.put(new Employee("JDCK", 25, new MyDate(1998, 5, 3)),100);
        emset.put(new Employee("JDCK", 25, new MyDate(1998, 5, 3)),98);
        emset.put(new Employee("JBCK", 43, new MyDate(1998, 3, 7)),33);
        emset.put(new Employee("JCCK", 42, new MyDate(1997, 6, 7)),66);
        emset.put(new Employee("JkCK", 54, new MyDate(1996, 3, 6)),1234);
        emset.put(new Employee("JECK", 56, new MyDate(1367, 3, 7)),652);
        emset.put(new Employee("JFCK", 23, new MyDate(1736, 6, 9)),262);

        // Employee e1 = new Employee("wangxianzhi",41,new MyDate(334,5,4));
        // Employee e2 = new Employee("simaqian",43,new MyDate(-145,7,12));
        // Employee e3 = new Employee("yanzhenqin",44,new MyDate(709,5,9));
        // Employee e4 = new Employee("zhangqian",51,new MyDate(-179,8,12));
        // Employee e5 = new Employee("quyuan",21,new MyDate(-340,12,4));

        // emset.add(e1);
        // emset.add(e2);
        // emset.add(e3);
        // emset.add(e4);
        // emset.add(e5);
        Set enrtyset=emset.entrySet();
        Iterator iterator = enrtyset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-13 12:33:51
 * 
 * @LastEditTime: 2021-11-13 12:33:52
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
