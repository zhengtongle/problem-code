package org.example.滑行;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int maxCount = Integer.MIN_VALUE;
    static int[][] maxMap;

    public static void dfs(int[][] array, int startI, int startJ, int count, int[][] map) {

        if (
                startI > n
                        || startJ > m
                        || startJ == 0
                        || startI == 0
                        || map[startI][startJ] == 1
        ) {
            maxCount = Math.max(maxCount,count);
            if(maxCount == count){
                maxMap = map;
            }
            return;
        }
        map[startI][startJ] = 1;

        if (startI < n) {
            if (array[startI + 1][startJ] < array[startI][startJ]) {
                    dfs(array, startI + 1, startJ, count + 1, map);
            }
        }
        if (startJ < m) {
            if (array[startI][startJ + 1] < array[startI][startJ]) {
                    dfs(array, startI, startJ + 1, count + 1, map);

            }
        }
        if (startI > 0) {
            if (array[startI - 1][startJ] < array[startI][startJ]) {
                    dfs(array, startI - 1, startJ, count + 1, map);
            }
        }
        if (startJ > 0) {
            if (array[startI][startJ - 1] < array[startI][startJ]) {
                    dfs(array, startI, startJ - 1, count + 1, map);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        int[][] array = new int[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        // 寻找起点
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // 开始滑雪
                dfs(array, i, j, 0, new int[n + 1][m + 1]);

            }
        }
        System.out.println(maxCount);
        for (int i = 0; i < maxMap.length; i++) {
            System.out.println(Arrays.toString(maxMap[i]));
            
        }

    }
}
