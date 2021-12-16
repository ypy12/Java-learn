/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-16 23:15:21
 * @LastEditTime: 2021-12-16 23:56:28
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.没做出来;

import java.util.List;

import com.ypy.suanfa.ListNode;

public class leetcode24 {
    public static ListNode swapPairs(ListNode head) {

        // 哨兵节点
        ListNode node0 = new ListNode(666);
        node0.next = head;
        head = node0;

        ListNode node1 = head.next;
        ListNode node2 = node1.next;
        while (node1.next != null && node2.next != null) {
            node1.next = node2.next;
            node2.next = node1;
            node0.next=node2;
            node1.next = swapPairs(node1.next);
        }
        return node2.next==null||node1.next==null?node0:node2;
    }

    // public static ListNode swap(ListNode head) {
    //     if (head == null || head.next == null) {
    //         return head;
    //     }
    //     ListNode node1 = head.next;
    //     ListNode node2 = node1.next;
        
    //     node1.next = node2.next;
    //     node2.next = node1;
        
    //     return node2;
    // }

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
