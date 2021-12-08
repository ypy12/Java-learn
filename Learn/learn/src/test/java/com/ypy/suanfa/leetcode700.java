/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-08 11:36:04
 * @LastEditTime: 2021-12-08 11:57:16
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

public class leetcode700 {
    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (val == root.val) {
            return root;
        }
        return searchBST(val < root.val ? root.left : root.right, val);

    }

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2, new TreeNode(7), new TreeNode(32));
        TreeNode right = new TreeNode(3, new TreeNode(31), new TreeNode(8));
        TreeNode root = new TreeNode(1, left, right);
        TreeNode rNode = searchBST(root, 7);
        System.out.println(rNode);
    }
}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-08 11:36:04
 * 
 * @LastEditTime: 2021-12-08 11:36:05
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
