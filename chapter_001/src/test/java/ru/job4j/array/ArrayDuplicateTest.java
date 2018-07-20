package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.*;

public class ArrayDuplicateTest {
    @Test
    public void deleteDublicateInArray() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = {"рожь", "пшеница", "семена", "лен", "рис", "лен"};
        String[] result = duplicate.exit(input);
        String[] except = {"рожь", "пшеница", "семена", "рис", "лен"};
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}
