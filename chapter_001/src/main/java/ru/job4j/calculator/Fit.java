package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
int rost;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double ideal;
    public double manWeight(double height) {
        return ideal=(height-100)*1.15;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return ideal=(height-110)*1.15;
    }
}