package ru.rud.exam;

public class Item {
    private String name;
    private int price;
    private Robot rob;

    public Item(String name, int price, Robot rob) {
        this.name = name;
        setPrice(price);
        this.rob = rob;
    }

    public void setPrice(int price) {
        this.price = price;
        rob.changeCheck(price);
    }

    public String getName() {
        return name;
    }
}
