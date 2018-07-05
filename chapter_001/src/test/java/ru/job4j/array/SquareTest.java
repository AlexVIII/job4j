package ru.job4j.array;

        import org.junit.Test;
        import static org.hamcrest.core.Is.is;
        import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBound3Then149() {
        int ix = 1, iy = 1;
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound, ix, iy);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect));
    }
    @Test
    public void whenBound3Then567() {
        int ix = 2, iy = 1;
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound, ix, iy);
        int[] expect = new int[] {4, 9, 16};
        assertThat(rst, is(expect));
    }
    @Test
    public void whenBound3Then357() {
        int ix = 2, iy = 2;
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound, ix, iy);
        int[] expect = new int[] {4, 16, 36};
        assertThat(rst, is(expect));
    }
}