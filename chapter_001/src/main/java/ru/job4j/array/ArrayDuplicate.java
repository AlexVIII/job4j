package ru.job4j.array;
import java.util.Arrays;
public class ArrayDuplicate {
    public String[] exit(String[] array) {
        int abc = array.length;
        for (int out = 0; out < abc; out++) {
            for (int in = out + 1; in < abc; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array [abc - 1];
                    abc--;
                    in--;
                }
            }
        }
   return Arrays.copyOf(array, abc);
       }
}
