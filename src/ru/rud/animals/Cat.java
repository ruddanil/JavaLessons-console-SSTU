package ru.rud.animals;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println(name + ": Мяу!");
    }

    public void meow(int count) {
        String output = name + ": Мяу";
        if (count > 1) {
            for (int i = 1; i < count - 1; i++)
                output += "-мяу";
            output += "-мяу!";
        } else if (count == 1) output = name + ": Мяу!";
        else output = name + ": о.о";
        System.out.println(output);
    }

    @Override
    public String toString() {
        return "Кот: " + name;
    }
}
