package ru.job4j.OperatorIfTest;
import org.junit.Test;
import ru.job4j.OperatorIf.DummyBot;

import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/*
    * @author Aleksandr Vasyanin
    * @version 1.0
    * @since 14/05/2018
     */

public class DummyBotTest {
    @Test
    public  void whenGreetBot(){
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Привет, Бот."),
                is("Привет, умник.")
        );

    }
    @Test
    public void wwhenUnknownBot(){
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Какое сегодня число"),is("Это ставит меня в тупик.Спросите другой вопрос.")
        );
    }

    @Test
    public void whenByuBot(){
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Пока"),is("До скорой встречи.")
        );
    }
}
