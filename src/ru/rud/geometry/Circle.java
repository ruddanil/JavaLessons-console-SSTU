package ru.rud.geometry;

public class Circle {
    private Point center;
    private int r;

    public Circle(Point center, int r) {
        this.center = center;
        if(r<0) throw new NegativeArraySizeException();
        this.r = r;
    }

    public Point getCenter() {
        return new Point (center.getX(), center.getY());
    }
}
