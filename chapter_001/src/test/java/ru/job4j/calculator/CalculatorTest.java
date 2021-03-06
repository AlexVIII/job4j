package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1, 1);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubtractOneMinusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.subtract(1, 1);
        double result = calc.getResult();
        double expected = 0;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubtractOneDelimOneThenTwo() {
        Calculator calc = new Calculator();
        calc.div(2, 1);
        double result = calc.getResult();
        double expected = 2;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMultipleOneUmnozhOneThenTwo() {
        Calculator calc = new Calculator();
        calc.multiple(4, 2);
        double result = calc.getResult();
        double expected = 8;
        assertThat(result, is(expected));
    }

}