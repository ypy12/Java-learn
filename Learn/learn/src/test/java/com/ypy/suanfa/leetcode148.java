/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-13 23:44:07
 * @LastEditTime: 2021-12-14 23:41:57
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;



public class leetcode148 {
    public static ListNode sortList(ListNode head) {
        return divideList(head);
    }

    public static ListNode divideList(ListNode head) {
        //迭代截止的依据，已经不够分两个链表了
        if (head == null || head.next == null) {
            return head;
        }
        //使用快慢指针，将链表从中甸点分开
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //后一个链表的头指针
        ListNode LastListNode = slow.next;
        //截断前后两个链表
        slow.next = null;
        //前一个链表的排序
        ListNode List1 = sortList(head);
        //后一个链表的排序
        ListNode List2 = sortList(LastListNode);
        //合并两个有序链表
        ListNode result = mergeTwoLists(List1, List2);
        return result;
        
    }
    //21题搬过来的
    public static ListNode mergeTwoLists(ListNode List1, ListNode List2) {
        if (List1 == null) {
            return List2;
        }
        if (List2 == null) {
            return List1;
        }
        if (List1.val > List2.val) {
            List2.next = mergeTwoLists(List1, List2.next);
            return List2;
        } else {
            List1.next = mergeTwoLists(List1.next, List2);
            return List1;
        }

    }

    public static void main(String[] args) {
        // ListNode head1 = new ListNode(0);
        // int i = 1;
        // while (i < 6) {
        // // 头插法
        // ListNode head2 = new ListNode(i);
        // head2.next = head1;
        // head1 = head2;
        // i++;
        // }
        ListNode root = new ListNode(1);
        ListNode head1 = new ListNode(6);
        ListNode head3 = new ListNode(7);
        ListNode head4 = new ListNode(2);
        head1.next = root;
        root = head1;
        head3.next = root;
        root = head3;
        head4.next = root;
        root = head4;
        ListNode test = sortList(root);
        while (test != null) {
            System.out.println(test.val);
            test = test.next;
        }

    }

}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-13 23:44:07
 * 
 * @LastEditTime: 2021-12-14 22:24:29
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
