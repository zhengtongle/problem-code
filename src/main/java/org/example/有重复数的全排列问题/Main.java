package org.example.有重复数的全排列问题;

import java.util.*;

public class Main {


    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        s = s.replace("[", "");
        s = s.replace("]", "");

        s = s.replace(" ", "");

        String[] split = s.split(",");

        int[] array = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }

//        System.out.println(Arrays.toString(array));
        dfs(new boolean[array.length], 0, array, new int[array.length]);
//        System.out.println(list);

        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }

    private static void dfs(boolean[] flag, int n, int[] array, int[] answer) {
        if (n == array.length) {
            list.add(Arrays.toString(answer));
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (!flag[i]) {
                flag[i] = true;
                answer[n] = array[i];
                dfs(flag, n + 1, array, answer);
                flag[i] = false;
            }
        }
    }
}
