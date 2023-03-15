package org.example.递增的数;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int a = Integer.MAX_VALUE;
        String answer = "YES";
        int a = n % 10;
        n /= 10;
        while(n != 0){
            int i  = n % 10;
            if(a <= i){
                answer = "NO";
                break;
            }
            a = i;
            n/=10;
        }
        System.out.println(answer);

    }
}
