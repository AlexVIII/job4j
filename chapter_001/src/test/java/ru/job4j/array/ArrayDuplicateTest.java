package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.Arrays;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {

        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        ArrayDuplicate array = new ArrayDuplicate();
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = array.remove(input);
        String[] expect = {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));

    }
}