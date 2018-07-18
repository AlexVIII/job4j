package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int inn = data.length;
        for (int i = 1; i < inn; i++) {

                    if (data[i][i] != data[i - 1][i - 1]) {
                        result = false;
                        break;
                    }
                if (data[inn - i][i - 1] != data[inn - i - 1][i]) {
                result = false;
                break;
            }

               }


        return result;
    }


}