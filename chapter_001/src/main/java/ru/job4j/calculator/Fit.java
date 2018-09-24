package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
int rost;
    double ideal;
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}