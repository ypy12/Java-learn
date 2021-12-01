/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-01 21:07:30
 * @LastEditTime: 2021-12-01 22:14:02
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.List;

public class leetcode234 {
    public static boolean isPalindrome(ListNode head) {
        // 方法二
        // List<Integer> number=new ArrayList<Integer>();
        // if (head == null || head.next == null)
        // return true;
        // while (head != null) {
        // number.add(head.val);
        // head=head.next;
        // }
        // for(int i=0;i<number.size()/2;i++){
        // if(number.get(i)!=number.get(number.size()-1-i)){
        // return false;
        // }
        // }
        // return true;

        // 方法二
        if (head == null || head.next == null)
        return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next!= null&&fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow.next);
        while (head != null && slow != null) {
            if (slow.val == head.val) {
                head = head.next;
                slow = slow.next;
            }else{
                return false;
            }
        }
        return true;

    }

    public static ListNode reverse(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode head1 = new ListNode(3);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(1);
        head1.next = root;
        root = head1;
        head3.next = root;
        root = head3;
        head4.next = root;
        root = head4;
        // head3.next=root;
        // root=head3;
        System.out.println(isPalindrome(root));

    }
}
