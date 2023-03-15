package org.example.二进制位数;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextInt();
        int n = 2022;
        int count = 0;
        while(n != 0){
            n = n >> 1;
//            System.out.println(n);
            count++;
        }
        System.out.println(count);
    }
}
