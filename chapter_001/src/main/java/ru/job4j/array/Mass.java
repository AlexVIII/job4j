package ru.job4j.array;

public class Mass {
    public static void main(String[] args) {
        int rst = -1, el = 5;
        int[] data = new int[]{3, 4, 2};
        for (int index = 0; index < 3; index++) {
            System.out.println(data[index]);
            if (data[index] == el) {
                //             System.out.println(data[index]);
                rst = index;
                break;
            }

        }
        System.out.println(rst);
    }
}
