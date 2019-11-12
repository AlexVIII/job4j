package ru.job4j.manual;

import javax.xml.bind.SchemaOutputResolver;

public class Man {
    public static void main(String[] args) {
MethodExam exam = new MethodExam();
    String s1 = exam.set();
    String s2 = exam.set("Super");
    String s3 = exam.set("5");

    System.out.println(s1);
    System.out.println(s2);
        System.out.println(s3);
        exam.set(true);

}

    }



