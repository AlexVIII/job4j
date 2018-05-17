package ru.job4j.operator;
/*
    * @author Aleksandr Vasyanin
    * @version 1.0
    * @since 14/05/2018
     */
public class DummyBot {
    /**
     * Отвечаем на вопросы.
     * @param question Вопрос клиента.
     * @return Ответ.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик.Спросите другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
