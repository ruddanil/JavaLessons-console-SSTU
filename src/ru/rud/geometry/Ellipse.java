package ru.rud.geometry;

public class Ellipse {
    private int r1,r2;
    private Point center;

    private Ellipse(int r1, int r2, Point center) {
        this.r1 = r1;
        this.r2 = r2;
        this.center = center;
    }

    public boolean isCircle () {
        return (this.r1 == this.r2);
    }

    public static Ellipse createEllipse (int r1, int r2, Point c) {
        return new Ellipse(r1,r2,c);
    }

    public static Ellipse createCircle (int r1, Point c) {
        return new Ellipse(r1,r1,c);
    }
}
