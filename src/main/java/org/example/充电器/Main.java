package org.example.充电器;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = scanner.nextLine();
        }

        int preTime = Integer.MAX_VALUE;
        int sum = 0;
        int cn = 0;
        for (int i = 0; i < n; i++) {
            String[] s = strs[i].split(" ");// [0] : 时间 [1] : 伏特 [2] : 电流
//            System.out.println(s[0]);
            int U = Integer.parseInt(s[1]);
            int I = Integer.parseInt(s[2]);

            String[] split = s[0].split(":"); // [0] : 小时 [1] : 分钟 [2] : 秒

            int time = Integer.parseInt(split[0]) * 60 * 60;

            time += Integer.parseInt(split[1]) * 60;
            time += Integer.parseInt(split[2]);

            if (preTime >= time) {
                preTime = time;
                cn = U * I;
            } else {
                sum += (time - preTime) * cn;
                preTime = time;
//                System.out.println(sum);
                cn = U * I;
            }

//            System.out.println(time * U * I);

        }
        System.out.println(sum);
    }
}
