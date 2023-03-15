package org.example.周几;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(((a + n) % 7) == 0 ? 7 : (a + n) % 7);
    }
}
