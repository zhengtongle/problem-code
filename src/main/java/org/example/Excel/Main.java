package org.example.Excel;

public class Main {
    public static void main(String[] args) {
//        System.out.println((char)(97 - 32));


//        System.out.println((char)(26 % 26 + 65));
        int n = 2022;
        System.out.println((char)(n % 26 + 65));
        System.out.println((char)(n / 26 % 26 + 65));
        System.out.println((char)(n / 26 / 26 % 26 + 65));
//        System.out.println((char)(n / 26 / 26  / 26 % 26 + 65));
    }
}
