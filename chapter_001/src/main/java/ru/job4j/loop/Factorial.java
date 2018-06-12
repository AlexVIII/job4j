package ru.job4j.loop;
/*
    * @author Aleksandr Vasyanin
    * @version 1.0
    * @since 09/06/2018
    **/

public class Factorial {
    /**
     * Вычисляем сумму четных чисел
     * @param n
     * @return Ответ
     */
    public int calc(int n) {
        int temp = 1;
        if (n > 1) {
            for (int a = 1; a <= n; a++) {
                temp = temp * a;
            }
        }
    return temp;
    }
}
