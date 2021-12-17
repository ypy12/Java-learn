/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-16 23:15:21
 * @LastEditTime: 2021-12-17 10:40:58
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.List;

import javax.swing.RowSorter;

public class leetcode24 {
    //自己写的方法一
    // public static ListNode swapPairs(ListNode head) {
    //     if (head == null || head.next == null) {
    //         return head;
    //     }
    //     // 哨兵节点
    //     ListNode node0 = new ListNode(666);
    //     node0.next = head;
    //     head = node0;

    //     while (true) {
    //         ListNode node1 = node0.next;
    //         while (node1!=null) {
    //             node0.next=swap(node1);
    //             node0=node1;
    //             node1=node0.next;
    //         }
    //         return head.next;
    //     }

    // }

    // public static ListNode swap(ListNode head) {
    //     if (head == null || head.next == null) {
    //         return head;
    //     } else {
    //         ListNode node1 = head;
    //         ListNode node2 = node1.next;
    //         if (node2.next == null) {
    //             node1.next = null;
    //         } else {
    //             node1.next = node2.next;
    //         }
    //         node2.next = node1;

    //         return node2;
    //     }

    // }
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode res = head.next;
        head.next = swapPairs(res.next);
        res.next = head;
        return res;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(4);
        ListNode head1 = new ListNode(3);
        ListNode head3 = new ListNode(2);
        // ListNode head4 = new ListNode(1);
        head1.next = root;
        root = head1;
        head3.next = root;
        root = head3;
        // head4.next = root;
        // root = head4;
        ListNode test = swapPairs(root);
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
 * @Date: 2021-12-16 23:15:21
 * 
 * @LastEditTime: 2021-12-16 23:15:21
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
