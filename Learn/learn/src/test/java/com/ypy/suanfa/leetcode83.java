/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-01 19:07:47
 * @LastEditTime: 2021-12-15 23:24:49
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode83 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = head;
        ListNode p1 = head.next;
        while (p1 != null) {
            if (p.val == p1.val)
                p.next = p1.next;
            else
                p = p.next;
            p1 = p.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(0);
        ListNode head1 = new ListNode(1);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(3);
        head1.next = root;
        root = head1;
        head3.next = root;
        root = head3;
        head4.next = root;
        root = head4;
        // head3.next=root;
        // root=head3;
        ListNode head2 = deleteDuplicates(root);
        while (head2 != null) {
            System.out.println(head2.val);
            head2 = head2.next;
        }
    }

}
