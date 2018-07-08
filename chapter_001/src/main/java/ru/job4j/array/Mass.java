package ru.job4j.array;

public class Mass {
    public static void main(String[] args) {
        int[] array = {9,8,7,6,5};
            int temp = 0;
            //temp = array.length;
            for (int index = 0; index < array.length-3; index++) {
                temp = array[index];
                array[index]=array[array.length-index-1];
                array[array.length-index-1]=temp;


            }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

    }
}