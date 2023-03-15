package org.example.滑行2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int n;
    static int m;
    static int maxCount = Integer.MIN_VALUE;

    public static void dfs(int[][] array, int[][] map, int count, int i, int j) {
//        System.out.println(count);
        maxCount = Math.max(maxCount, count);
//        if (maxCount == count) {
//            for (int[] item : map) {
//                System.out.println(Arrays.toString(item));
//            }
//            System.out.println("Count:" + count);
//            System.out.println("+++++++++++++++");
//        }

        int a = array[i][j];
        if (i < n - 1) {
            if (a > array[i + 1][j]) {
                if (map[i + 1][j] == 0) {
                    map[i + 1][j] = count;
                    dfs(array, map, count + 1, i + 1, j);
                    map[i + 1][j] = 0;
                }
            }
        }
        if (j < m - 1) {
            if (a > array[i][j + 1]) {
                if (map[i][j + 1] == 0) {
                    map[i][j + 1] = count;
                    dfs(array, map, count + 1, i, j + 1);
                    map[i][j + 1] = 0;
                }
            }
        }
        if (i > 0) {
            if (a > array[i - 1][j]) {
                if (map[i - 1][j] == 0) {
                    map[i - 1][j] = count;
                    dfs(array, map, count + 1, i - 1, j);
                    map[i - 1][j] = 0;
                }
            }
        }
        if (j > 0) {
            if (a > array[i][j - 1]) {
                if (map[i][j - 1] == 0) {
                    map[i][j - 1] = count;
                    dfs(array, map, count + 1, i, j - 1);
                    map[i][j - 1] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(Arrays.toString(array[i]));
//        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int[][] map = new int[n][m];
                map[i][j] = 1;
                dfs(array, map, 1, i, j);
            }
        }

//        dfs(array, map, 1, 1, 0);
        System.out.println(maxCount);
    }

}
