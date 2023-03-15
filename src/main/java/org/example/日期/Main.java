package org.example.日期;

public class Main {
    public static void main(String[] args) {
        for (int year = 1900; year <= 9999; year++) {
            int[] array = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            for (int moment = 1; moment <= 12; moment++) {
                for (int day = 0; day < array[moment]; day++) {
                    
                }
            }

        }
    }
}
