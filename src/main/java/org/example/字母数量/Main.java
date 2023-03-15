package org.example.字母数量;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if((int)chars[i] > 97 && (int)chars[i] < 122){
//                System.out.println(chars[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
