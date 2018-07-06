package ru.job4j.array;

public class Turn {
    public int[]  turn(int[] data ) {
            int temp =0;
        for (int index = 0; index < data.length-1; index++) {
            if (index == 0){
                temp = data[index];
                data[index] = data[data.length-index-1];
            }

            //int temp = data[index];
            data[index] = temp;

          //  data[data.length-index-1]= temp;



        }
        return data;
    }
}