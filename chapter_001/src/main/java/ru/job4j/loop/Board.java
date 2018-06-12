package ru.job4j.loop;

/*
    * @author Aleksandr Vasyanin
    * @version 1.0
    * @since 09/06/2018
    **/

public class Board {
    /**
     * Рисуем шахматную доску
     * @param height
     * @param width
     * @return Ответ
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int x = 1; x <= width; x++) {
            for (int y = 1; y <= height; y++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if (x + y % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}
