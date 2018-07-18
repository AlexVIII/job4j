package ru.job4j.array;

public class ArrayDuplicate {
    public String[] exit(String[] data){
        int end = data.length;
        for (int i = 1, i < end, i++) {
            if ( data[i] == data[end]){
                end = end -1;
            }
        }

    }
}
