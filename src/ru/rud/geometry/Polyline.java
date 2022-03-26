package ru.rud.geometry;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
    // Список, хранящий в себе объекты типа Point
    private List<Point> points = new ArrayList<>();

    // Пустой конструктор
    public Polyline() {

    }

    // Метод, добавляющий точки (три точки - значит при использовании
    // можно передать аргументы через запятую
    public void addPoint(Point... points) {
        for (Point p : points)
            this.points.add(p);
    }

    // Геттер с инкапсуляцией: возвращает КОПИЮ массива точек
    public List<Point> getPoints() {
        return new ArrayList<Point>(points);
    }

    // Метод вычисления длины
    public double getLength() {
        double length = 0;

        if (points.size() == 0) return length; // если массив пустой - длина 0
        for (int i = 0; i < points.size() - 1; i++)
            // используем метод вычисления длины из Point и используем его на точках массива
            length += points.get(i).getLength(points.get(i + 1));
        return length;
    }

    @Override
    public String toString() {
        String output = "Линия ";
        for (Point p : points) output += p + " ";
        return output;
    }
}
