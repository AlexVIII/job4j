package ru.job4j.array;

public class Square {
    public int[] calculate(int bound, int ix, int iy) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат

        for (int index = 0; index < bound; index++) {
                   rst[index] = ix * ix;
                   ix = ix +iy;
        }
        return rst;

    }
}
