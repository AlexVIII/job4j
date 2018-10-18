package ru.job4j.calculator;
public class Converter {
    int euro = 70, dol = 60;
    public int rubleToEuro(int value) {
        return value / euro;
    }
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
