package ru.rud.time;

public class TimeWithZone extends Time {
    private int timeZone;

    public TimeWithZone(int sec, int timeZone) {
        super(sec);
        if (timeZone > 50400 || timeZone < -43200 || timeZone % 1800 != 0)
            throw new IllegalArgumentException("Часовой пояс от +14 до -12, интервал 30 минут");
        else this.timeZone = timeZone;
    }

    public int getTimeZone() {
        return timeZone;
    }

    @Override
    public String toString() {
        String output = "";
        if (timeZone > 0) output += "+";
        else {
            output += "-";
            timeZone *= -1;
        }
        int hourTZ = timeZone / 60 / 60;
        int minTZ = (timeZone / 60) % 60;
        if (hourTZ < 10) output += "0" + hourTZ + ":";
        else output += hourTZ + ":";
        if (minTZ < 10) output += "0" + minTZ + " UTC";
        else output += minTZ + " UTC";
        return getHour() + ":" + getMin() + ":" + getSec() + " " + output;
    }
}
