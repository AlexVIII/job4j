package ru.job4j.shildt.rekursia;

public class Factorial {
    int fact(int n) {
        int result;
        if (n == 1) {
            return 1;
        }
     //   System.out.println(n);
        result =  fact(n - 1) * n;
        System.out.println(fact(n - 1));
        System.out.println(n);
        System.out.println("результат " + fact(n - 1) + " и " + n + " = " + result);
        return result;
    }
    }
    class Recursion {
        public static void main(String[]args) {
            Factorial f = new Factorial();
            System.out.println("Факториал 3 = " + f.fact(4));
          //  System.out.println("Факториал 5 = " + f.fact(5));
          //  System.out.println("Факториал 10 = " + f.fact(10));
        }
    }
