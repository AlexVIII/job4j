package ru.job4j.array;
public class Mass {
    public static void main(String[] args) {
        int size = 3;
        boolean rez = true;
        int[][] tbl = new int[][]{
                {1, 2, 2},
                {1, 1, 1},
                {1, 2, 1}
        };
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    if (tbl[i][j] != 1) {
                        rez = false;
                        break;
                    }
                }
            }
        }
        System.out.print(rez);
    }
}
