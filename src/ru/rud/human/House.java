package ru.rud.human;

public class House {
    private int floorCount;

    public House(int floorCount) {
        if (floorCount < 0) throw new IllegalArgumentException("Дом должен иметь положительное число этажей");
        this.floorCount = floorCount;
    }

    public String toString() {
        if (floorCount != 11 && floorCount % 10 == 1) {
            return "Дом с " + floorCount + " этажом";
        }
        return "Дом с " + floorCount + " этажами";
    }
}
