package org.example.杨辉三角;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || (i == j)) {
                    dp[i][j] = 1;
                } else {
                    if(j > 0){
                        dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                    }
                }
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
