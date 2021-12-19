package ru.rud.geometry;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
    private List<Point> points = new ArrayList<Point>();

    public Polyline(Point... points) {
        addPoint(points);
    }

    public void addPoint(Point... points) {
        for (Point p : points)
            this.points.add(p);
    }

    public List<Point> getPoints() {
        return new ArrayList<Point>(points);
    }

//    public double getLength() {
//        double length = 0;
//        if (points.size() == 0) return length;
//        for (int i = 0; i < points.size() - 1; i++)
//            length += Line.getLength(points.get(i), points.get(i + 1));
//        return length;
//    }

    @Override
    public String toString() {
        String output = "Линия ";
        for (Point p : points) output += p + " ";
        return output;
    }
}
