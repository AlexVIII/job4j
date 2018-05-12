package ru.job4j.condition;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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
        Point a = this;
        Point b = that;
     /** int x1 = a.x;
        int x2 = b.x;
        int y1 = a.y;
        int y2 = b.y;

       System.out.println("x1 = "+ a.x);
        System.out.println("y1 = "+ a.y);
        System.out.println("x2 = "+ b.x);
        System.out.println("y2 = + "+ b.y);
    **/
     double result = 2*(Math.pow(this.x-this.x,that.y)+Math.pow(this.y-that.y,that.x))/((this.x+that.x)*(this.y+that.y));
          return result;
    }
public static void main(String[] args) {
        Point a = new Point(3, 2);
        Point b = new Point(2, 5);
    double result = a.distanceto(b);
    System.out.println("Расстояние между двумя точками А и В = "+ result);
}


}
 