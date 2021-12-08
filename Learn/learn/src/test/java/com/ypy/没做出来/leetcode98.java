package com.ypy.没做出来;
/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-08 12:23:41
 * @LastEditTime: 2021-12-08 13:24:11
 * @LastEditors: YPY
 * @Reference: 
 */
// package com.ypy.suanfa;

// public class leetcode98 {
//     public static boolean isValidBST(TreeNode root) {
//         int val = root.val;
//         return isValidBST_1(root, val);

//     }

//     public static boolean isValidBST_1(TreeNode root, int max) {
//         if (root == null) {
//             return true;
//         }
//         if (root.left != null) {
//             if (root.val <= root.left.val || root.val > max) {
//                 return false;
//             } else {
//                 isValidBST_1(root.left, max);
//             }
//         }
//         if (root.right != null) {
//             if (root.val >= root.right.val || root.val < max) {
//                 return false;
//             } else {
//                 isValidBST_1(root.right, max);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         // TreeNode left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
//         // TreeNode right = new TreeNode(5, new TreeNode(6), new TreeNode(8));
//         // TreeNode root = new TreeNode(4, left, right);

//         TreeNode left = new TreeNode(4);
//         TreeNode right = new TreeNode(6, new TreeNode(3), new TreeNode(7));
//         TreeNode root = new TreeNode(5, left, right);
//         boolean t = isValidBST(root);
//         System.out.println(t);
//     }
// }
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-12-08 12:23:41
 * 
 * @LastEditTime: 2021-12-08 12:23:42
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
