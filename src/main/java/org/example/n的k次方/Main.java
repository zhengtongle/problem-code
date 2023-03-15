package org.example.n的k次方;

import java.util.Scanner;

public class Main {
    public static int dd(int n, int m) {
        if (m == 0 || m == 1) {
            return n;
        }
        return dd(n, m - 1) * n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int answer = dd(n, m);
        System.out.println(answer);
    }
}
