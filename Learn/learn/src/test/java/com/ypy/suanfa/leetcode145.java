/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-03 11:44:02
 * @LastEditTime: 2021-12-03 12:18:47
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class leetcode145 {
    // 迭代写法
    // public static List<Integer> postorderTraversal(TreeNode root) {
    // List<Integer> res = new ArrayList<Integer>();
    // postorder(root, res);
    // return res;
    // }

    // private static void postorder(TreeNode root, List<Integer> res) {
    // if (root == null)
    // return ;
    // postorder(root.left, res);
    // postorder(root.right, res);
    // res.add(root.val);

    // }
    // 迭代写法
    public static List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> number = new ArrayList<Integer>();
        while (!stack.empty() || root != null) {
            while (root != null) {
                number.add(root.val);
                stack.push(root);
                root = root.right;
            }
            root = stack.pop();
            root = root.left;

        }
        Collections.reverse(number);
        return number;
    }

    public static void main(String[] args) {

        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);
        List<Integer> qianxu = postorderTraversal(root);
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
 * @Date: 2021-12-03 11:44:02
 * 
 * @LastEditTime: 2021-12-03 11:44:02
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
