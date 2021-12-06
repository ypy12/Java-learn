/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-06 11:18:31
 * @LastEditTime: 2021-12-06 11:35:57
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class leetcode226 {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    // public static void invert(TreeNode root_right, TreeNode root_left) {
    //     TreeNode s = new TreeNode();
    //     s = root_left;
    //     root_left = root_right;
    //     root_right = s;
    // }



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
        
        TreeNode left = new TreeNode(4, null, new TreeNode(3));
        TreeNode right = new TreeNode(5, null, new TreeNode(31));
        TreeNode root = new TreeNode(1, left, right);
        TreeNode root1 = invertTree(root);
        List<Integer> qianxu = inorderTraversal(root1);
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
 * @Date: 2021-12-06 11:18:31
 * 
 * @LastEditTime: 2021-12-06 11:18:31
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
