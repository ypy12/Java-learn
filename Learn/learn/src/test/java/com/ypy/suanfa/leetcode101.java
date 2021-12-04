/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-04 21:20:13
 * @LastEditTime: 2021-12-04 22:13:40
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode101 {
    // 对证树的形式，左半只的根左右==右半只的根由左
    // public static boolean isSymmetric(TreeNode root) {
    // List<Integer> res_left = new ArrayList<Integer>();
    // List<Integer> res_right = new ArrayList<Integer>();
    // if (root == null || (root.right == root.left)) {
    // return true;
    // }
    // root_left_rightorder(root.left, res_left);
    // root_right_leftorder(root.right, res_right);
    // if (res_right.equals(res_left)){
    // return true;
    // }
    // return false;
    // }

    // public static void root_left_rightorder(TreeNode root, List<Integer> res) {
    // if (root == null) {
    // res.add(null);
    // return ;
    // }
    // res.add(root.val);
    // root_left_rightorder(root.left, res);
    // root_left_rightorder(root.right, res);
    // }

    // public static void root_right_leftorder(TreeNode root, List<Integer> res) {
    // if (root == null) {
    // res.add(null);
    // return ;
    // }
    // res.add(root.val);
    // root_right_leftorder(root.right, res);
    // root_right_leftorder(root.left, res);
    // }
    // 方法二：官方递归法，控制两个指针的移动，一个指针从左往右，一个指针从右往左移动，同时比较。
    public static boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public static boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }

    public static void main(String[] args) {

        TreeNode left = new TreeNode(2, null, new TreeNode(3));
        TreeNode right = new TreeNode(2, null, new TreeNode(3));
        TreeNode root = new TreeNode(1, left, right);
        boolean b = isSymmetric(root);
        System.out.println(b);
    }

}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-04 21:20:13
 * 
 * @LastEditTime: 2021-12-04 21:23:43
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
