package ru.job4j.condition;


/**
 * @author Aleksandr Vasyain (stockon@yandex.ru)
 * @version 1.0
 * @since 12/05/2018
 */


class Point {
    private int x;
    private int y;
    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distanceto(Point that) {
      /*  Point a = this;
        Point b = that;
        int x1 = a.x;
        int x2 = b.x;
        int y1 = a.y;
        int y2 = b.y;
        */
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));

    }

    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        double result = a.distanceto(b);
        System.out.println("Расстояние между двумя точками А и В = " + result);
    }
}
 