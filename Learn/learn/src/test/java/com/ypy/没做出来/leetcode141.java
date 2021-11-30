package com.ypy.没做出来;

import java.util.ArrayList;
import java.util.List;

/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-30 12:04:35
 * @LastEditTime: 2021-11-30 13:35:33
 * @LastEditors: YPY
 * @Reference: 
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class leetcode141 {
    public static boolean hasCycle(ListNode head) {
        if (head.next == null) {
            return false;
        }
        List<Integer> number = new ArrayList<Integer>();
        while (true) {
            if (head.next != null) {
                head = head.next;
                if (number.contains(head.val)) {
                    return true;
                } else {
                    number.add(head.val);
                }

            } else {
                return false;
            }
        }

    }

    public static void main(String[] args) {
       ListNode head1=new ListNode(0);
       int i=1;
       while(i<5)
       {  
           //头插法
          ListNode head2=new ListNode(i);
          head2.next=head1;
          head1=head2;
          i++;
       }
       ListNode head2=new ListNode(2);
       head2.next=head1;
       head1=head2;
       System.out.println(hasCycle(head1));
    }
}
