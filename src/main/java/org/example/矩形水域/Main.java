package org.example.矩形水域;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int ss = sc.nextInt();
        int[][] array = new int[n + 1][m + 1];
        for (int i = 0; i < ss; i++) {
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            for (int j = r1; j <= r2; j++) {
                for (int k = c1; k <= c2; k++) {
                    array[j][k] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (array[i][j] == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
