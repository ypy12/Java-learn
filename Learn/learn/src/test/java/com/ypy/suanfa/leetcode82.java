/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-15 23:13:04
 * @LastEditTime: 2021-12-16 23:14:12
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode82 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } 
        
        // 对应关系：pre指向cur的前一个节点，cur当前系欸但，fast为cur的下一个节点
        // cur！=fast的时候大家都往前走
        // cur==fast的时候让fast往前走找到第一个不等于cur的值，就要进行节点的删除了
        // cur=fast;pre.next=fast;
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode fast = cur;
        // 先找到一个不会被删除的头节点。
        if (pre.val == pre.next.val) {
            while (pre != null && pre.val == head.val) {
                pre = pre.next;
            }
            return deleteDuplicates(pre);
        }
        while (fast.next != null) {
            fast = fast.next;
            if (cur.val == fast.val) {
                while (fast.val == cur.val) {
                    // 找到最后也没找到不同的元素，就让pre.next==NULL就返回head;
                    if (fast.next == null) {
                        pre.next = null;
                        return head;
                    }
                    fast = fast.next;
                }
                // 找到值不同的节点了
                cur = fast;
                pre.next = cur;
                continue;
            } else {
                pre= cur;
                cur = fast;
            }

        }
        return head;
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode head1 = new ListNode(0);
        ListNode head3 = new ListNode(0);
        ListNode head4 = new ListNode(0);
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
