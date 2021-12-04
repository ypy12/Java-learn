/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-04 20:45:34
 * @LastEditTime: 2021-12-04 21:15:38
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode104 {
    public static int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    public static void main(String[] args) {

        TreeNode left = new TreeNode(2);
        //TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, null);
        int maxnumber = maxDepth(root);
        System.out.println(maxnumber);
    }

}
