package org.example.最大子序和;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        -2,1,-3,4,-1,1,2,4,2,1,-5,4

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String[] split = s.split(",");

        int[] array = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }


        int n = array.length;
        int[] dp = new int[n + 1];

        int pre = Math.max(array[0], array[1]);
        int max = Integer.MIN_VALUE;
        for (int i = 2; i < n; i++) {
            pre = Math.max(array[i] + pre,pre);
            max = Math.max(max,pre);
            System.out.println(pre);
        }

//        for (int i = 0; i < dp.length; i++) {
//            System.out.print(dp[i] + ",");
//        }
    }
}
