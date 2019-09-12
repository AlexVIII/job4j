package ru.job4j.search.lite;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void  main(String[]args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(5);
        set.add(4);
        set.add(0);

        for (Integer value : set) {
            System.out.println(value);
        }
        int sell = 10, summ = 3;
        int dr = sell / summ;
        System.out.println("__________________");
        System.out.println(dr);
    }



}
