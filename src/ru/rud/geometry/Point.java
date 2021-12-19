package ru.rud.geometry;

public class Point implements Cloneable {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getLength(Point other){
        return Math.sqrt(Math.pow((this.getX() - other.getX()), 2) + Math.pow((this.getY() - other.getY()), 2));
    }

    public Point clone(){
        try {
            return (Point)super.clone();
        } catch (CloneNotSupportedException e){
            throw new RuntimeException(e);
        }

    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}
