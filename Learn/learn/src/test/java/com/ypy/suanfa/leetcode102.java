/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-04 22:25:36
 * @LastEditTime: 2021-12-04 23:29:09
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode102 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> sum = new ArrayList<List<Integer>>();
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        if (root == null) {
            return sum;
        }
        nodes.offer(root);

        while (!nodes.isEmpty()) {
            int size=nodes.size();
           // Queue<TreeNode> node = new LinkedList<TreeNode>();
            List<Integer> ceng = new ArrayList<Integer>();
            while (!nodes.isEmpty()&&size>0) {
                TreeNode cur = nodes.poll();
                size--;
                ceng.add(cur.val);
                if (cur.left != null) {
                    nodes.offer(cur.left);
                }
                if (cur.right != null) {
                    nodes.offer(cur.right);
                }

            }


            sum.add(ceng);
        }
        return sum;
    }


    public static void main(String[] args) {

        TreeNode left = new TreeNode(4, null, new TreeNode(3));
        TreeNode right = new TreeNode(5, null, new TreeNode(31));
        TreeNode root = new TreeNode(1, left, right);
        List<List<Integer>> sum = levelOrder(root);
        System.out.println(sum);
    }
}
