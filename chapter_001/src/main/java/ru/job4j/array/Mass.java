package ru.job4j.array;

public class Mass {
    public static void main(String[] args) {
        int[] array = {9,5,7};
            int temp;
            //temp = array.length;
            for (int index = 0; index < 3; index++) {
                temp = array[index];
                array[index]=array[array.length-index-1];
                array[array.length-2]=temp;


            }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}