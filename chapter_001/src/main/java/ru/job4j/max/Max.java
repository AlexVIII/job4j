package ru.job4j.max;

import static java.lang.Double.max;

/*
    * @author Aleksandr Vasyanin
    * @version 1.0
    * @since 14/05/2018
    **/

public class Max {
    /**
     * Берем два числа
     * Сравниваем.
     * Находим наибольшее.
     * @param first
     * @param second
     * @param third
     * @return Ответ
     */



    public double maxim (int first, int second, int third) {
        double temp = max(first, second);
        return max(temp, third);
        }
}
