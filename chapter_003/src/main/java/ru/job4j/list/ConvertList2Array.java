package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (list.size() / rows) + 1;
        int[][] array = new int[rows][cells];
        int i = 0, j = 0;
        for (int element : list) {
            array[i][j] = element;
            j++;
            if (j == cells){
                j = 0;
                i++;
            }
            int tabl = i * j;
            if (list.size() - tabl < rows) {
                array[i][j] = 0;
            }
        }
        return array;
    }
}
