package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            for (int j = 1; j < data.length; j++) {
                if ( i == j  ){
                    if (data[i][j] != data[i-1][j-1]) {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }

}