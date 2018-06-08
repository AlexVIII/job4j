package ru.job4j.loop;

/*
    * @author Aleksandr Vasyanin
    * @version 1.0
    * @since 08/06/2018
    **/

public class Counter {

    /**
     * Вычисляем сумму четных чисел
     * @param start
     * @param finish
     * @return Ответ
     */
    public int summa(int start, int finish){
        int temp = 0;
        for (int a=start; a<=finish; a++){
         if (a % 2 == 0){
             temp = temp + a;
         }
        }
        return temp;
   }

}
