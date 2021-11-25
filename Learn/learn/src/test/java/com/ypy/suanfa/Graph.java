/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-21 23:17:54
 * @LastEditTime: 2021-11-24 11:11:23
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private static final String NEWLINE = System.getProperty("line.separator");
    private final int V;
    private int E;
    private List<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = (List<Integer>[]) new List[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new ArrayList<Integer>(V);
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }
/**
 * 添加边，根据邻接表的含义，一条边连接两个顶点，在顶点A的邻接表放入顶点B，在顶点B的邻接表放入顶点A，则构成边。
 * @param v
 * @param w
 */
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        //边的个数加1
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " vertices, " + E + " edges " + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (int w : adj[v]) {
                s.append(w + " ");
            }
            s.append(NEWLINE);
        }
        return s.toString();

    }
}
