package ru.rud.human;

public class Way {
    private City city;
    private int cost;

    public Way(City city, int cost) {
        this.city = city;
        this.cost = cost;
    }

    public City getCity() {
        return city;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return city.getName() + ": " + cost;
    }
}