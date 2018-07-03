package ru.job4j.array;

public class Mass {
    public static void main(String[] args) {
        int[] rst = new int[5];
        for (int index = 0; index < rst.length; index++) {
            rst[index] = index + index;
            System.out.println(rst[index]);
        }
    }
}


