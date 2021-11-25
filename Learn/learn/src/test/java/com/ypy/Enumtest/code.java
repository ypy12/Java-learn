/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-21 22:29:43
 * @LastEditTime: 2021-11-21 22:44:36
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.Enumtest;

import java.util.List;

public class code {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public int maxDepth(Node root) {
        int max = 0;
        // Node root1=new Node();
        if (root == null) {
            return max;
        }
        if (root.children == null) {
            return max = 1;
        }
        for (Node root1 : root.children) {
            max = Math.max(max, maxDepth(root1));
        }
        return max;
    }

}
/*
 * @Description:
 * 
 * @Author: YPY
 * 
 * @Date: 2021-11-21 22:29:43
 * 
 * @LastEditTime: 2021-11-21 22:29:43
 * 
 * @LastEditors: YPY
 * 
 * @Reference:
 */
