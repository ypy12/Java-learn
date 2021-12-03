/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-03 11:34:00
 * @LastEditTime: 2021-12-03 12:26:47
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode94 {
    // 方法一：迭代
    // public static List<Integer> inorderTraversal(TreeNode root) {
    // List<Integer> res = new ArrayList<Integer>();
    // inorder(root, res);
    // return res;
    // }

    // public static void inorder(TreeNode root, List<Integer> res) {
    // if (root == null) {
    // return;
    // }

    // inorder(root.left, res);
    // res.add(root.val);
    // inorder(root.right, res);
    // }
    // 递归
    public static List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> number = new ArrayList<Integer>();
        while (!stack.empty() || root != null) {
            while (root != null) {

                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            number.add(root.val);
            root = root.right;

        }
        return number;
    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        //TreeNode right_rightchild = new TreeNode(4);
        //TreeNode right = new TreeNode(3, right_rightchild, null);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);
        List<Integer> qianxu = inorderTraversal(root);
        for (int i : qianxu) {
            System.out.println(i);
        }
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-03 11:34:00
 * 
 * @LastEditTime: 2021-12-03 11:34:00
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
