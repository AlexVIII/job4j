package ru.job4j.manual;

import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;




public class ManCollection {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(55);
        list.add(65);
        Iterator<Integer> iter = list.iterator();

        while (iter.hasNext()){
            System.out.println("Возраст " + iter.next());
        }

        boolean empty = list.isEmpty();
        System.out.println(empty);

     }
}
