package ru.rud.time;

public class Time {
    public int sec;
    public int min;
    public int hour;

    // Конструктор для создания времени количеством секунд
    public Time(int sec) {
        if (sec > 86400) sec = 86400;
        this.sec = sec % 60;
        this.min = (sec / 60) % 60;
        this.hour = sec / 60 / 60;
    }
    // Конструктор для создания времени при помощи часов, минут и секунд
    public Time(int hour, int min, int sec) {
        if (hour > 24) hour = 24;
        if (min > 60) min = 60;
        if (sec > 60) sec = 60;
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }
    // Какой сейчас час
    public int getHour() {
        return hour;
    }


    public int getSec() {
        return sec;
    }

    public int getMin() {
        return min;
    }






    public String toString() {
        return hour + ":" + min + ":" + sec + "\n";
    }
}
