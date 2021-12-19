package ru.rud.time;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Time {
    private int sec;
    private int min;
    private int hour;
    GregorianCalendar gcalendar = new GregorianCalendar();

    public Time(int sec) {
        if (sec > 86400) sec = 86400;
        this.sec = sec % 60;
        this.min = (sec / 60) % 60;
        this.hour = sec / 60 / 60;
    }

    public int getSec() {
        return sec;
    }

    public int getMin() {
        return min;
    }

    public int getHour() {
        return hour;
    }

    public Time(int hour, int min, int sec) {
        if (hour > 24) hour = 24;
        if (min > 60) min = 60;
        if (sec > 60) sec = 60;
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int whatHourNow() {
        return gcalendar.get(Calendar.HOUR);
    }

    public int whatMinuteNow() {
        return gcalendar.get(Calendar.MINUTE);
    }

    public int whatSecondNow() {
        return gcalendar.get(Calendar.SECOND);
    }

    public String toString() {
        return hour + ":" + min + ":" + sec + "\n";
    }
}
