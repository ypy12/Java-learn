package com.ypy.suanfa;
/*
 * @Description: 基于深度优先的路径查找。
 * @Author: YPY
 * @Date: 2021-11-21 23:12:10
 * @LastEditTime: 2021-11-24 10:50:59
 * @LastEditors: YPY
 * @Reference: 
 */

import java.util.ArrayList;

import java.util.List;
import java.util.Stack;

public class DFS {
    private boolean[] marked;
    // 从A到B经历的边的条数
    private int[] edgeTo;
    // 起点
    private final int s;
    private int count;

    public DFS(Graph G, int s) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        count = 0;
        dfs(G, s);

    }

    /**
     * 深度优先
     * 
     * @param G
     * @param v
     */
    private void dfs(Graph G, int v) {
        // 把v点记为被标记过，后面就不会遍历到v
        marked[v] = true;
        //
        count++;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }

        }

    }

    public boolean marked(int w) {
        return marked[w];
    }

    public int getcount() {
        return count;
    }

    public boolean hasPathTo(int v) {
        return marked(v);
    }

    public Iterable<Integer> search(Graph G, int s) {
        DFS dfs = new DFS(G, s);
        List<Integer> list = new ArrayList<Integer>(dfs.getcount());
        for (int v = 0; v < G.V(); v++) {
            if (dfs.marked[v]) {
                list.add(v);
            }
        }
        return (Iterable<Integer>) list;
    }

    public Iterable<Integer> PathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        Stack<Integer> path = new Stack<Integer>();
        for (int x = v; x != s; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);
        return path;
    }
    public Iterable<Integer> PathTo(Graph G,int s,int v){
        DFS dfspath=new DFS(G, s);
        return dfspath.PathTo(v);
    }

}