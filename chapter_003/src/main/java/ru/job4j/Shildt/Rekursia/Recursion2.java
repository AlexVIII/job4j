package ru.job4j.shildt.rekursia;


class RecTest {
    int[] values;

    RecTest(int i) {
        values = new int[i];
    }

    // вывести рекурсию
    void printArat(int i) {
        if (i == 0) {
            {
                return;
            }
            if (i != 0) {
                printArat(i - 1);
            }


            System.out.println("[" + (i - 1) + "]" + " = " + values[i - 1]);
        }

public class Recursion2 {
    public static void main(String[]args) {
        RecTest m = new RecTest(15);
        int i;
        for (i = 0; i < 15; i++) {
            m.values[i] = i * 10;
        }
        m.printArat(15);
    }

}
