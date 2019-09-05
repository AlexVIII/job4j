package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertList2Array {


    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double) list.size() / rows);
        int[][] array = new int[rows][cells];
        int indexrow = 0;
        int indexcell = 0;
        for (int elem : list) {
            array[indexrow][indexcell] = elem;
            if (indexcell < cells - 1) {
                indexcell++;
            } else {
                indexcell = 0;
                indexrow++;
            }
        }
        return array;
    }


    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] mass: list) {
            for (int elem: mass) {
                result.add(elem);
            }
        }
        return  result;
    }
}
