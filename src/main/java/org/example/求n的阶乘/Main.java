package org.example.求n的阶乘;

import java.util.Scanner;

public class Main {
    public static double dd(int n) {
        if (n==1) {
            return n;
        }
        return dd(n - 1) * n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double answer = dd(n);
        System.out.printf("%.0f",answer);
    }
}
