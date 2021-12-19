package ru.rud.animals;

import java.util.Random;

public class Cuckoo extends Bird {
    @Override
    public void sing() {
        Random random = new Random();
        int r = random.nextInt(10);
        for(int i = 0; i <= r; i++)
            System.out.println("ку-ку");
    }
}
