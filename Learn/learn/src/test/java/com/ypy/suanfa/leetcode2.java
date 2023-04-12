package com.ypy.suanfa;

public class leetcode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode cur=l3;
        int carry=0;
        while(l1!=null&&l2!=null){
            int x=l1==null?0:l1.val;
            int y=l2==null?0:l2.val;
            int result = x+y+carry;
            int sum=result%10;
            carry = result/10;
            cur.next=new ListNode(sum);
            cur=cur.next;
            if(l1 !=null){
                l1 = l1.next;
            }
            //当链表l2 不等于null的时候，将l2的节点后移
            if(l2 !=null){
                l2 = l2.next;
            } 
        }
        if(carry == 1){
            cur.next = new ListNode(carry);
        }
        return l3.next;
      }
}
