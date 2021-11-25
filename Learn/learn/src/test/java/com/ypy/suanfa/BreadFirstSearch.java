/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-24 10:53:54
 * @LastEditTime: 2021-11-24 11:09:53
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BreadFirstSearch {
    private boolean[] marked;
    private int s;
    private int[] edgeTo;

    public void BreadFirstSearch(Graph G, int s) {
        this.s = s;
        this.marked = new boolean[G.V()];
        this.edgeTo = new int[G.V()];
        bfs(G, s);
    }

    public void bfs(Graph G, int s) {
        Queue<Integer> queue = new LinkedList<>();
        // s访问过的标记
        marked[s] = true;
        queue.offer(s);
        if (!queue.isEmpty()) {
            int v = queue.poll();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    edgeTo[w] = v;
                    marked[w] = true;
                    queue.offer(w);
                }
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }

        Stack<Integer> path = new Stack<>();
        for (int i = v; i != s; i = edgeTo[i]) {
            path.push(i);
        }
        path.push(s);
        return path;
    }

}
