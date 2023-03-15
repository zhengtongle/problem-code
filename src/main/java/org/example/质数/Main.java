package org.example.质数;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
            }
        }
    }
}
