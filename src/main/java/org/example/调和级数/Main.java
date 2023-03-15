package org.example.调和级数;

public class Main {

    public static void main(String[] args) {


        for (int j = 0; j < 100000; j++) {

            double[] arr = new double[100000];
            for (int i = 1; i <= j; i++) {
                if (i == 1) {
                    arr[i] = 1;
                } else {
                    arr[i] = (1.0 / i) + arr[i  - 1];
                }
            }
//            if(arr[j] >= 12){
                System.out.println(j + "," + arr[j]);
//            }
        }

    }
}
