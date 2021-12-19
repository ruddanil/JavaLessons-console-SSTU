package ru.rud.geometry;

public abstract class Shape {
    private Point point;
    private Point point2;
    private Point point3;
    private int value;
    private int secondSide;

    public Shape(Point point, int value) {
        if (value <= 0) throw new IllegalArgumentException("Длина стороны должна быть больше нуля");
        this.point = point;
        this.value = value;
    }

    public Shape(Point point, int firstSide, int secondSide) {
        this.point = point;
        this.value = firstSide;
        this.secondSide = secondSide;
    }

    public Shape(Point point1, Point point2, Point point3) {
        this.point = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public abstract double getArea();

}
