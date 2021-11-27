/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-27 19:59:14
 * @LastEditTime: 2021-11-27 20:08:08
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;



public class leetcode566{
    public int[][] matrixReshape(int[][] mat, int r, int c) {
     int m=mat.length;
     int n=mat[0].length;
     if(m*n!=r*c){
         return mat;
     }
    
     int[][] mat1=new int[r][c];
     for (int x = 0; x < m * n; ++x) {
        mat1[x / c][x % c] = mat[x / n][x % n];
    }
    return mat1;
    }
}