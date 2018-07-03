package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
       int ix = 1;
        for (int index = 0; index < bound; index++) {
                   rst[index] = (ix+index) * (ix+index);
        }
        return rst;

    }
}
