/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-11-28 10:26:11
 * @LastEditTime: 2021-11-29 11:52:10
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.io.Serial;
import java.util.HashSet;
import java.util.Set;

public class leetcode36 {
    public static boolean isValidSudoku(char[][] board) {
        //暴力法，速度慢
        // Set<Character> number = new HashSet<Character>();
        // Set<Character> number1 = new HashSet<Character>();
        // Set<Character> number3 = new HashSet<Character>();
        // for (int i = 0; i < board.length; i++) {

        //     for (int j = 0; j < board[i].length; j++) {
        //         System.out.println("行扫描" + board[i][j]);
        //         if (board[i][j] == '.') {

        //         } else {
        //             // 扫描一行
        //             if (number.contains(board[i][j])) {
        //                 return false;
        //             }
        //             number.add(board[i][j]);
        //         }

        //     }
        //     for (char c : number) {
        //         System.out.println("前number数值" + c);
        //     }
        //     number.removeAll(number);

        // }
        // for (int i = 0; i < 9; i++) {
        //     for (int j = 0; j < 9; j++) {
        //         System.out.println("行扫描" + board[j][i]);
        //         if (board[j][i] == '.') {
        //         } else {
        //             // 扫描一行
        //             if (number1.contains(board[j][i])) {
        //                 return false;
        //             }
        //             number1.add(board[j][i]);

        //         }
        //     }
        //     for (char c : number1) {
        //         System.out.println("前number1数值" + c);
        //     }
        //     number1.removeAll(number1);
        // }

        // // 扫描小方格
        // // 标记小方格的行
        // int m = 0;
        // int r = 0;
        // while (m < 3) {
        //     m++;
        //     r=0;
        //     while (r < 3) {
        //         {
        //             r++;
        //             for (int i = m * 3 - 3; i < m * 3; i++) {
        //                 for (int j = r * 3 - 3; j < r * 3; j++) {
        //                     System.out.println("格扫描" + board[i][j]);
        //                     if (board[i][j] == '.') {
        //                     } else {

        //                         if (number3.contains(board[i][j])) {
        //                             return false;
        //                         }
        //                         number3.add(board[i][j]);
        //                     }

        //                 }

        //                 for (char c : number3) {
        //                     System.out.println((r + m) + "格扫描" + c);
        //                 }

        //             }
        //             number3.removeAll(number3);

        //         }

        //     }
        // }
        // return true;
        // 记录某行，某位数字是否已经被摆放
        boolean[][] row = new boolean[9][9];
        // 记录某列，某位数字是否已经被摆放
        boolean[][] col = new boolean[9][9];
        // 记录某 3x3 宫格内，某位数字是否已经被摆放
        boolean[][] block = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    System.out.println(num);
                    int blockIndex = i / 3 * 3 + j / 3;
                    
                    for(boolean[] n:row){
                        for(boolean t:n){
                            System.out.println("row值"+t);
                        }
                    }
                    if (row[i][num] || col[j][num] || block[blockIndex][num]) {
                        return false;
                    } else {
                        row[i][num] = true;
                        col[j][num] = true;
                        block[blockIndex][num] = true;
                    }
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        char[][] board = new char[][] {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }

        };
    //     char[][] board = new char[][] {
    //         { '.', '.', '4', '.', '.', '.', '6', '3', '.' },
    //         { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
    //         { '5', '.', '.', '.', '.', '.', '.', '9', '.' },
    //         { '.', '.', '.', '5', '6', '.', '.', '.', '.' },
    //         { '4', '.', '3', '.', '.', '.', '.', '.', '1' },
    //         { '.', '.', '.', '7', '.', '.', '.', '.', '.' },
    //         { '.', '.', '.', '5', '.', '.', '.', '.', '.' },
    //         { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
    //         { '.', '.', '.', '.', '.', '.', '.', '.', '.' }

    // };
        System.out.println(isValidSudoku(board));
    }
}