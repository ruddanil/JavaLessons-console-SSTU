package ru.rud.human;

public class CityWithReverse extends City {
    public CityWithReverse(String name, Way... ways) {
        super(name, ways);
    }

    @Override
    public void addWay(Way way) {
        super.addWay(way);
        Way wayRev = new Way(this, way.getCost());
        for(Way w : way.getCity().getWays()){
            if(wayRev.getCity() == w.getCity()) return;
        }
        way.getCity().addWay(wayRev);
    }
}
