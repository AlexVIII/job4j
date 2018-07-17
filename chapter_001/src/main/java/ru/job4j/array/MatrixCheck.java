package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {

                    if (data[i][i] != data[i-1][i-1]) {
                        result = false;
                        break;
                    }

               }

        for (int i = 0; i < data.length-2; i++) {

            if (data[i+1][i] != data[i+2][i+1]) {
                result = false;
                break;
            }

        }
        for (int i = 0; i < data.length-2; i++) {

            if (data[i][i+1] != data[i+1][i+2]) {
                result = false;
                break;
            }

        }

        return result;
    }

}