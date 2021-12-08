/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-08 12:01:17
 * @LastEditTime: 2021-12-08 12:22:19
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode701 {
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode cur = root;
        if(root==null){
            root=new TreeNode(val);
        }
        while(cur != null) {
            if (val > cur.val) {
                if (cur.right == null) {
                    cur.right = new TreeNode(val);
                    break;
                } else {
                    cur = cur.right;
                }

            }
            if (val < cur.val) {
                if (cur.left == null) {
                    cur.left = new TreeNode(val);
                    break;
                } else {
                    cur = cur.left;
                }
            }
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode right = new TreeNode(7,new TreeNode(5),new TreeNode(8));
        TreeNode root = new TreeNode(4, left, right);
        TreeNode rNode = insertIntoBST(root, 6);
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-08 12:01:17
 * 
 * @LastEditTime: 2021-12-08 12:01:18
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
