package ru.job4j.condition;
public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
   }
        public double period(double ab, double ac, double bc) {
        return (ab + bc + ac) / 2;
    }
        public double area() {
        double rsl = -1;
        double ab = this.a.distanceto(this.b);
        double ac = this.a.distanceto(this.c);
        double bc = this.b.distanceto(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            // написать формулу для расчета площади треугольника.
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }
    private boolean exist(double ab, double ac, double bc) {
        return ab < bc + ac && bc < ab + ac && ac < ab + bc;
    }
}

