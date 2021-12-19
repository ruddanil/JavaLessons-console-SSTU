package ru.rud.geometry;

import java.util.List;

public class ClosedPolyline extends Polyline {
    public ClosedPolyline(Point... points) {
        super(points);
    }

//    @Override
//    public double getLength() {
//        double length = getLength();
//        List<Point> points = getPoints();
//        return length += Line.getLength(points.get(points.size() - 1), points.get(0));
//    }
}
