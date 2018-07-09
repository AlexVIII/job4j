package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        int x = 0;
        for (int i = 0; i < data.length-1; i++) {
            if (data[i] = true ){
                x = x + i ;
            }

            }

        if ( x == data.length ){
            result = true;
        }


        return result;
    }
}