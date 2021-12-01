/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-01 13:36:30
 * @LastEditTime: 2021-12-01 18:18:02
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

class ListNode {

    public ListNode(int val) {
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

public class leetcode203 {
    public static ListNode removeElements(ListNode head, int val) {

        if (head == null)
            return null;
        if (head.val == val) {
            head = head.next;
            removeElements(head, val);
        }
        ListNode cur = head;
        ListNode pre = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre= cur;
            }
            cur=cur.next;
        }
        return head;

    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(0);
        int i = 1;
        while (i < 5) {
            // 头插法
            ListNode head2 = new ListNode(i);
            head2.next = head1;
            head1 = head2;
            i++;
        }
        ListNode head2 = new ListNode(2);
        head2.next = head1;
        head1 = head2;
        head1 = removeElements(head1, 3);
        for (int m = 0; m < i; m++) {
            System.out.println(head1.val);
            head1 = head1.next;
        }
    }

}