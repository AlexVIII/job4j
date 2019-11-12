package ru.job4j.manual;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ManCollectionSet {
    public static void main(String[] args) {
        List<String> last = new ArrayList<>();
        last.add("St");
        last.add("St1");
        last.get(0);
        last.remove(0);
        for (String item: last){
            System.out.println(item);
        }
        System.out.println("коллекция  Set");
        Set<String> set = new HashSet<String>();
        set.add("stado1");
        set.add("stado1");
        set.add("stado2");
        set.add("stado4");
        set.add("stado3");

        set.remove("stado1");
        for (String e: set){
            System.out.println(e);
        }
    }
}
