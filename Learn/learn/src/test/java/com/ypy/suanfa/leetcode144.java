/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-03 11:13:58
 * @LastEditTime: 2021-12-03 12:23:46
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.ypy.suanfa.TreeNode;

public class leetcode144 {
    // 方法一：迭代
    // public static List<Integer> preorderTraversal(TreeNode root) {
    // List<Integer> res = new ArrayList<Integer>();
    // preorder(root, res);
    // return res;
    // }

    // public static void preorder(TreeNode root, List<Integer> res) {
    // if (root == null) {
    // return;
    // }
    // res.add(root.val);
    // preorder(root.left, res);
    // preorder(root.right, res);
    // }
    // 方法二 递归
    public static List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> number = new ArrayList<Integer>();
        while (!stack.empty() || root != null) {
            while (root != null) {
                number.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;

        }

        return number;
    }

    public static void main(String[] args) {

        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);
        List<Integer> qianxu = preorderTraversal(root);
        for (int i : qianxu) {
            System.out.println(i);
        }
    }
}
