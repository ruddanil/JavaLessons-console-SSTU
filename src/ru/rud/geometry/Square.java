//package ru.rud.geometry;
//
//public class Square extends Shape {
//    private Point leftUp;
//    private int sideLength;
//
//    public Square(Point leftUp, int sideLength) {
//        super(leftUp, sideLength);
//    }
//
//    @Override
//    public double getArea() {
//        return 0;
//    }
//
//    public Square(int xLeftUp, int yLeftUp, int sideLength) {
//        this(new Point(xLeftUp, yLeftUp), sideLength);
//    }
//
//    public void setSideLength(int sideLength) {
//        if (sideLength <= 0) throw new IllegalArgumentException("Длина стороны должна быть больше нуля");
//        this.sideLength = sideLength;
//    }
//
//    public int getSideLength() {
//        return sideLength;
//    }
//
//    public Polyline getPolyline() {
//        Point rightUp = new Point(leftUp.getX() + sideLength, leftUp.getY());
//        Point rightDown = new Point(rightUp.getX(), rightUp.getY() - sideLength);
//        Point leftDown = new Point(rightDown.getX() - sideLength, rightDown.getY());
//        return new Polyline(leftUp, rightUp, rightDown, leftDown);
//    }
//
//    @Override
//    public String toString() {
//        return "Квадрат в точке " + leftUp + " со стороной " + sideLength;
//    }
//}
