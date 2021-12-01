/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-30 13:46:13
 * @LastEditTime: 2021-11-30 13:58:38
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import com.ypy.suanfa.leetcode203;

public class leetcode21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null)
            return list2;

        else if (list2 == null)
            return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-30 13:46:13
 * 
 * @LastEditTime: 2021-11-30 13:46:30
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
