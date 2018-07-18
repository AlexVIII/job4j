package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат

        for (int index = 0; index < bound; index++) {
                   rst[index] = (index + 1) * (index + 1);
        }
        return rst;

    }
    public int[] calculate1(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат

        for (int index = 0; index < bound; index++) {
            rst[index] = (index + 2) * (index + 2);
        }
        return rst;

    }
    public int[] calculate3(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
            int ix = 2;
        for (int index = 0; index < bound; index++) {
            rst[index] = (index + ix) * (index + ix);
            ix = ix + 1;
        }
        return rst;

    }
}
