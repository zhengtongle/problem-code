package org.example.晨跑;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;
        int count = 0;
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                if (days % 7 == 0 || days % 7 == 1) {
                    count++;
//                    System.out.println(i + "," + j);
                    days++;
                    continue;
                }
                days++;
                if (j == 1
                        || j == 11
                        || j == 21
                        || j == 31) {
//                    System.out.println(i + "," + j );
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
