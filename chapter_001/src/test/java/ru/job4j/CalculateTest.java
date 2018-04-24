package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Aleksandr Vasyanin (stockon@yandex.ru)
* @version $Id$
* @since 12.04/2018
*/
public class CalculateTest {
/**
* Test echo.
*/
@Test
    public void whenTakeNameThenTreeEchoPlusName() {
    String input = "Aleksandr Vasyanin";
    String expect = "Echo, echo, echo : Aleksandr Vasyanin"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}
 