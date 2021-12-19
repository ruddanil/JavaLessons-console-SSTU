package ru.rud.animals;

public abstract class Bird {
    private String song;

    public Bird(){}

    public Bird(String song) {
        if (song == null || song == "") throw new IllegalArgumentException("Передана пустая строка");
        setSong(song);
    }

    public abstract void sing();

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }
}
