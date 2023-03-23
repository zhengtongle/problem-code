package org.example.连续子数组的最大和;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String[] split = s.split(",");
        int[] array = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }

        int n = array.length;
        int[] dp = new int[n];
        dp[0] = array[0];
        dp[1] = array[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2]) + array[i];
            System.out.print(dp[i] + ",");
        }
        System.out.println(dp[n-1]);
    }
//    [-2,1,-3,4,-1,2,1,-5,4]
}
