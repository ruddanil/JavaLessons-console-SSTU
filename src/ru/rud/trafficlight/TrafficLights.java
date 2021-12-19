package ru.rud.trafficlight;

public class TrafficLights {

    private static Color lastLight;
    private Color curr = Color.RED;

    public String next() {
        String toRet = curr.getColour();
        curr = curr.next();
        return toRet;
    }

    public void offTrafficLigth() {
        lastLight = curr;
        curr = Color.BLACKBLACK;
        System.out.println(lastLight + " lastLight");
    }

    public void onTrafficLight() {
        curr = lastLight;
    }
    public void selectLigth(Color selected) {
        curr = selected;
    }
}
