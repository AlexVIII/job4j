package ru.job4j.pseudo;

/**
 * @author Alex Vasyanin ( stockon@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Triangle implements Shape{
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("  +  ");
        pic.append(" +  +");
        pic.append("++++++");
        return pic.toString();
    }
}