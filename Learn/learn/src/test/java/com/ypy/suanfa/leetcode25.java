/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-17 10:59:44
 * @LastEditTime: 2021-12-17 11:12:38
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;
public class leetcode25 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode tail = dummy;
        while (true) {
            int count = 0;
            while (tail != null && count != k) {
                count++;
                tail = tail.next;
            }
            if (tail == null) break;
            ListNode head1 = pre.next;
            while (pre.next != tail) {
                ListNode cur = pre.next;
                pre.next = cur.next;
                cur.next = tail.next;
                tail.next = cur;
            }
            pre = head1;
            tail = head1;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode root = new ListNode(4);
        ListNode head1 = new ListNode(3);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(1);
        head1.next = root;
        root = head1;
        head3.next = root;
        root = head3;
        head4.next = root;
        root = head4;
        ListNode test = reverseKGroup(root,4);
        while (test != null) {
            System.out.println(test.val);
            test = test.next;
        }
    }
}