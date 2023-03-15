package org.example.字符串;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        char[] chars = s.toCharArray();

        if (chars.length != 7){
            System.out.println("no");
            return;
        }
        char[] upper = "LANQIAO".toCharArray();
        char[] lower = "lanqiao".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!(chars[i] == upper[i] || chars[i] == lower[i])){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
