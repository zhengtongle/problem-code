package org.example.核酸日期;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();


        int answer = 1;

        if (m > n) {
            answer = m - n;
        }

        if (m < n) {
            answer = (7 - n) + m;
        }
        System.out.println(answer);
    }
}
