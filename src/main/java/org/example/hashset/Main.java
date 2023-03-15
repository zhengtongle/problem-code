package org.example.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("1213");
        set.add("1321");

        Object[] objects = set.toArray();

        System.out.println(Arrays.toString(objects));

    }
}
