/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-17 11:16:27
 * @LastEditTime: 2021-12-17 12:13:14
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode328 {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode oddLastNode = head;
        ListNode evenHead = head.next;
        ListNode evenLastNode = evenHead;

        while ( evenLastNode!= null&&evenLastNode.next != null) {
            // 交换
            // 还没有交换的链表
            ListNode node=null;
            if(evenLastNode!=null){
                node = evenLastNode.next;
            }
            evenLastNode.next = node.next;
            oddLastNode.next = node;
            node.next = evenHead;

            // 移动奇偶数头节点

            evenLastNode = evenLastNode.next;
            oddLastNode = oddLastNode.next;

        }
        return head;

    }

    public static void main(String[] args) {

        ListNode root = new ListNode(1);
        for (int i = 2; i < 9; i++) {
            ListNode node = new ListNode(i);
            node.next = root;
            root = node;
        }
        ListNode test = oddEvenList(root);
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
 * @Date: 2021-12-17 11:16:27
 * 
 * @LastEditTime: 2021-12-17 11:17:51
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
