package ru.rud.exam;

public class Account {
    private int cash;

    public Account(int cash) {
        this.cash = cash;
    }
    public int getCash() {
        return cash;
    }

    public int takeCash(int count) {
        if (cash > count) {
            cash -= count;
            return count;
        } else return 0;
    }

    public void putCash(int count) {
        cash += count;
    }
}
