/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-13 10:31:07
 * @LastEditTime: 2021-12-13 11:02:42
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.Stack;

public class leetcode100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> p_store = new Stack<TreeNode>();
        Stack<TreeNode> q_store = new Stack<TreeNode>();
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        p_store.push(p);
        q_store.push(q);
        while (!q_store.isEmpty() || !p_store.isEmpty()) {
            TreeNode q_cur = q_store.pop();
            TreeNode p_cur = p_store.pop();
            if (q_cur.val != p_cur.val) {
                return false;
            }
            if (q_cur.left != null && p_cur.left != null) {
                p_store.push(p_cur.left);
                q_store.push(q_cur.left);
            } else if (q_cur.left == null && p_cur.left == null) {
            } else {
                return false;
            }
            if (q_cur.right != null && p_cur.right != null) {
                q_store.push(q_cur.right);
                p_store.push(p_cur.right);
            } else if (q_cur.right == null && p_cur.right == null) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, null, right);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode root1 = new TreeNode(1);
        System.out.println(isSameTree(root, root1));
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-13 10:31:07
 * 
 * @LastEditTime: 2021-12-13 10:31:08
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
