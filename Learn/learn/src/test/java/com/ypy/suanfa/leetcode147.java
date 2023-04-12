package com.ypy.suanfa;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class leetcode147 {
    public static ListNode insertionSortList(ListNode head) {
     ListNode pre = new ListNode(0);
     ListNode cur = pre;
     cur.next = head;
     cur = cur.next;
     while(cur.next!=null){
        //下一个节点比现在的小，需要交换
     if(cur.next.val<cur.val){
       //插入的位置，当前值比它小，next比它大
       ListNode insert=pre;
       while(insert.next.val<cur.next.val){
           insert=insert.next;
       }
            //先找到cur.next的值
            ListNode temp=new ListNode(cur.next.val);
            //将cur指向cur.next.next
            cur.next=cur.next.next;
            ListNode temp2=insert.next;
            insert.next=temp;
            temp.next=temp2;
            
     }
     else{
        cur=cur.next;
     }
     }
     return pre.next;
    }
    public static void main(String[] args) {
        ListNode pre= new ListNode(4);
        ListNode pre1= new ListNode(2);
        ListNode pre2= new ListNode(1);
        ListNode pre3= new ListNode(3);
        pre.next=pre1;
        pre1.next=pre2;
        pre2.next=pre3;
        ListNode t1=insertionSortList(pre);
    }
}
