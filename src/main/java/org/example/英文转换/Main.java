package org.example.英文转换;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            //a, e, i, o, u
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                System.out.print((char) (s.charAt(i) - 32));
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}
