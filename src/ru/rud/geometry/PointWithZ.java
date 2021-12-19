package ru.rud.geometry;

public class PointWithZ extends Point {
    private int z;

    public PointWithZ(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public double getLength(Point other){
        PointWithZ p = (PointWithZ) other;
        return Math.sqrt(Math.pow((this.getX() - p.getX()), 2) + Math.pow((this.getY() - p.getY()), 2) + Math.pow((this.getZ() - p.getZ()), 2));
    }

    @Override
    public String toString() {
        return "{" + getX() + ";" + getY() + ";" + getZ() + "}";
    }
}
