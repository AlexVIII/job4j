package ru.job4j.search.lite;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args){
        Map<String, Integer>  students = new HashMap<>();
        students.put("Peter",3);
        students.put("Ivan",5);

        System.out.println(students.get("Peter"));

        for (String student: students.keySet()) {
            System.out.println(String.format("%s:%s",student,students.get(student)));
        }
    }
}
