package org.example.最小数;

public class Main {
    public static void main(String[] args) {
        for (int i = 2022; true; i++) {
            int n = i;
            boolean flag = true;
//            System.out.print(n + ",");
            while(n != 0){
                int a = n % 16;
                n /= 16;
                if(a < 10){
                    flag = false;
                    continue;
                }
            }

            if (flag){
                System.out.println(i);
                return;
            }
        }
    }
}
