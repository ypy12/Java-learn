/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-15 23:13:04
 * @LastEditTime: 2021-12-15 23:45:36
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.没做出来;

public class leetcode82 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode pre=head;
        ListNode cur = head;
        ListNode fast = head;
        while (fast.next!= null) {
            fast = fast.next;
            if (cur.val == fast.val) {
            while(fast.val==cur.val){
                if(fast.next==null){
                    pre.next=null;
                    return head;
                }
                fast=fast.next;
            }
            cur=fast;
            pre.next=cur;
            continue;
            } 
            else {
                cur = cur.next;
                
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(2);
        ListNode head1 = new ListNode(1);
        ListNode head3 = new ListNode(1);
        ListNode head4 = new ListNode(1);
        head1.next = root;
        root = head1;
        head3.next = root;
        root = head3;
        head4.next = root;
        root = head4;
        ListNode test = deleteDuplicates(root);
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
 * @Date: 2021-12-15 23:13:04
 * 
 * @LastEditTime: 2021-12-15 23:13:05
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
