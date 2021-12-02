/*
 * @Description: 
 * @Author: YPY
 * @Date: 2021-12-02 10:53:47
 * @LastEditTime: 2021-12-02 11:59:39
 * @LastEditors: YPY
 * @Reference: 
 */
package com.ypy.suanfa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class leetcode506 {
    public static String[] findRelativeRanks(int[] score) {
        // 方法一：
        // String[] result = new String[score.length];
        // int[] ranking = new int[score.length];
        // int k = 0;
        // for (int i : score) {
        // ranking[k] = i;
        // k++;
        // }
        // Arrays.sort(score);
        // for (int i = 0; i < score.length; i++) {
        // for (int m = 0; m < ranking.length; m++) {
        // if (score[i] ==ranking[m] && i < score.length - 3) {
        // int rank = ranking.length - i;
        // result[m] = Integer.toString(rank);
        // } else if (score[i] ==ranking[m] && i == score.length - 3) {
        // result[m] = "Bronze Medal";

        // } else if (score[i] ==ranking[m] && i == score.length - 2) {
        // result[m] = "Silver Medal";

        // } else if (score[i] ==ranking[m] && i == score.length - 1) {
        // result[m] = "Gold Medal";

        // }

        // }
        // }

        // return result;

        // 方法二：
        Map<Integer, String> rank = new HashMap<Integer, String>();
        String[] result = new String[score.length];
        int[] ranking = new int[score.length];
        int k = 0;
        for (int i : score) {
            ranking[k] = i;
            k++;
        }
        Arrays.sort(ranking);

        // 排名，给称号
        for (int i = 0; i < ranking.length; i++) {
            if (i < ranking.length - 3) {
                int rankname = ranking.length - i;
                rank.put(ranking[i], Integer.toString(rankname));
            }
            else if (i == ranking.length - 3) {
                rank.put(ranking[ranking.length - 3], "Bronze Medal");
            } else if (i == ranking.length - 2) {
                rank.put(ranking[ranking.length - 2], "Silver Medal");
            } else if (i == ranking.length -1) {
                rank.put(ranking[ranking.length - 1], "Gold Medal");
            }
        }

        // 按照顺序颁奖
        for (int i = 0; i < score.length; i++) {
            result[i] = rank.get(score[i]);
        }

        return result;

    }

    public static void main(String[] args) {
        int[] score = new int[] { 5,6 };
        String[] result = findRelativeRanks(score);
        for (String str : result) {
            System.out.println(str);
        }
    }

}