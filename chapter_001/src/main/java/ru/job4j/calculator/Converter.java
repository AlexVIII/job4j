package ru.job4j.calculator;
/**
 * Корвертор валюты.
 */

public class Converter {
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро
     */

    int euro = 70, dol = 60;

    public int rubleToEuro(int value) {
        return value / euro;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        return value / dol;
    }

    public int dollarToRuble(int value) {
        return dol * value;
    }

    public int euroToRuble(int value) {
        return euro * value;
    }
}
