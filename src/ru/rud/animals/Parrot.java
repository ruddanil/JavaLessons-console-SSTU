package ru.rud.animals;

import java.util.Random;

public class Parrot extends Bird {
    public Parrot(String song) {
        super(song);
    }

    @Override
    public void sing() {
        String originalString = this.getSong();
        char[] c = originalString.toCharArray();
        Random random = new Random();
        int r = random.nextInt(c.length-1);
        char tmp = ' ';
        tmp = c[r];
        c[r] = c[r + 1];
        c[r + 1] = tmp;
        String swappedString = new String(c);
        System.out.println(c);
    }
}
