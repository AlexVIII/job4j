package ru.job4j.array;

public class Mass {
    public static void main(String[] args) {
        int[] array = {9, 9, 9, 4, 5};
        int temp = 0, memo = 0;

        for (int index = 0; index < array.length - 1; index++) {
            memo = memo + 1;
            if (array[index] == 9) {
                temp = temp + 1;
            }
        }
         if (temp != memo){
            temp = -1000;
         }
        if (temp == memo){
            temp = 1000;
        }


            System.out.println(temp);


        }
}