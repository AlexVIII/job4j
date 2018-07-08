package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        int n = 0, m = 0;
        for (int i = 0; i < data.length-1; i++) {
            m = m + 1;
            if (data[i] == true ){
                n = n + 1;
            }

        }
        if ( n == m ){
            result = true;
        }
        if ( n != m ){
            result = false;
        }
        return result;
    }
}