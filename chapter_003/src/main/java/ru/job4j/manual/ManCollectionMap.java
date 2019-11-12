package ru.job4j.manual;

import java.util.ArrayList;
import java.util.List;

public class ManCollectionMap {
    public static void main(String[] args) {
        List<String> last = new ArrayList<String>();
        last.add("S1");
        last.add("S2");
        last.add("S3");

        for (String n : last){
            System.out.println(n);
        }
    }
}
