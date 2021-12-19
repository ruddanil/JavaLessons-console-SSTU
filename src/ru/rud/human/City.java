package ru.rud.human;

import ru.rud.human.Way;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private List<Way> ways = new ArrayList<Way>();

    public City(String name) {
        this.name = name;
    }

    public City(String name, Way... ways) {
        this.name = name;
        for (Way w : ways) addWays(w);
    }

    public void addWay(Way way) {
        for (Way w : ways)
            if (w.getCity() == way.getCity()) return;
        ways.add(way);
    }

    public void addWays(Way... ways) {
        for (Way w : ways)
            addWay(w);
    }

    public String getName() {
        return name;
    }

    public List<Way> getWays(){
        return ways;
    }

    public String toString() {
        String allWays = name + "\n";
        for (Way w : ways)
            allWays += "  " + w + "\n";
        return allWays;
    }
}
