package org.example.判断正负;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();

        if (i>0){
            System.out.println("正");
        }else {
            System.out.println("负");
        }
    }
}
