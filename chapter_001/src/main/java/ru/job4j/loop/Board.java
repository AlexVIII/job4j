package ru.job4j.loop;
/*
    * @author Aleksandr Vasyanin
    * @version 1.0
    * @since 09/06/2018
    **/

public class Board {

    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int x = 1; x <= width; x++) {
            for (int y = 1; y <= height; y++) {
                   if (x + y % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
             screen.append(ln);
        }
        return screen.toString();
    }
}
