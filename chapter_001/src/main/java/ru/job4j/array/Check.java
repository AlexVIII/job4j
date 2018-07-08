package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        int x = 0, y = 0;
        for (int i = 0; i < data.length-1; i++) {
            if (data[i] = true ){
                x = x + i ;
            }
            if (data[i] = false ){
                y = y +i;
            }
        }
        if ( x - data.length == 1 ){
            result = true;
        }
        if (  y - data.length == 1){
            result = true;
        }
        return result;
    }
}