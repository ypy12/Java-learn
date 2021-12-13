/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-13 23:20:56
 * @LastEditTime: 2021-12-13 23:42:47
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode876 {
    public static ListNode middleNode(ListNode head) {
  
        ListNode slow = head;
        ListNode fast = head;
        while (fast!= null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode head1 = new ListNode(2);
    //     ListNode head2 = new ListNode(3);
    //     ListNode head3 = new ListNode(4);
    //     ListNode head4 = new ListNode(5);
    //    ListNode head5 = new ListNode(6);
        // head1.next = root;
        // root = head1;
        // head2.next = root;
        // root = head2;
        // head3.next = root;
        // root = head3;
        // head4.next = root;
        // root = head4;
        // head5.next = root;
        // root = head5;
        ListNode rNode=middleNode(root);
        System.out.println(rNode.val);
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-13 23:20:56
 * 
 * @LastEditTime: 2021-12-13 23:20:59
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
