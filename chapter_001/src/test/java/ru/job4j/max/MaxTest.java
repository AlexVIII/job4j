package ru.job4j.max;
import org.junit.Test;
import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maks = new Max();
        double result = maks.maxim(115, 9, 14);
        assertThat(result, is(8));
    }

}
