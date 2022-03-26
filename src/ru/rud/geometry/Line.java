//package ru.rud.geometry;
//
//import java.util.Objects;
//
//public class Line<T extends Point> {
//    private T startPoint;
//    private T endPoint;
//
//    private Line(T startPoint, T endPoint) {
//        this.startPoint = startPoint;
//        this.endPoint = endPoint;
//    }
//
//    public static <D extends Point> Line<D> createLine(D startPoint, D endPoint) {
//        return new Line<>(startPoint, endPoint);
//    }
//
//    public static Line<Point> createLine(int x1, int y1, int x2, int y2) {
//        return new Line<>(new Point(x1, y1), new Point(x2, y2));
//    }
//
//    public static Line<PointWithZ> create3DLine(int x1, int y1, int z1, int x2, int y2, int z2) {
//        return new Line<>(new PointWithZ(x1, y1, z1), new PointWithZ(x2, y2, z2));
//    }
//
//    public void setEndPoint(T endPoint) {
//        this.endPoint = (T) endPoint.clone();
//    }
//
//    public void setStartPoint(T startPoint) {
//        this.startPoint = (T) startPoint.clone();
//    }
//
//    public T getEndPoint() {
//        return (T) endPoint;
//    }
//
//    public T getStartPoint() {
//        return (T) startPoint;
//    }
//
//    public double getLength() {
//        return startPoint.getLength(endPoint);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Line line = (Line) o;
//        return startPoint.equals(line.startPoint) && endPoint.equals(line.endPoint);
//    }
//
//    @Override
//    public int hashCode() {
//        return startPoint.hashCode() + endPoint.hashCode();
//    }
//
//    public Line clone() {
//        return new Line(startPoint.clone(), endPoint.clone());
//    }
//
//    public String toString() {
//        return "Линия от " + startPoint.toString() + " до " + endPoint.toString();
//    }
//
//
//}
