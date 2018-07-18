package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void DeleteDublicateInArray() {
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] input = new String[]{рожь, пшеница, семена, лен, рис, лен};
        String[] result = duplicate.exit(input);
        String[] expert = new String[]{рожь, пшеница, семена, лен, рис};
        assertThat(result,is(expert());
    }
}
