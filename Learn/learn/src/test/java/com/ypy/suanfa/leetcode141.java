package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.List;


/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-30 12:04:35
 * @LastEditTime: 2021-12-14 22:34:46
 * @LastEditors: YPY
 * @Reference: 
 */

class ListNode {

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
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
       for(int m=0;m<i;m++){
           System.out.println(head1.val);
           head1=head1.next;
       }
       System.out.println(hasCycle(head1));
    }
}
