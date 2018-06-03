package ru.job4j.max;
import org.junit.Test;
import ru.job4j.max.Max;
import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maks = new Max();
        int result = maks.maximum(3, 1, 2);
        assertThat(result, is(3));
    }

}
