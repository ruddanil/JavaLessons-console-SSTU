package ru.rud.exam;

public class Robot {
    private Account account;
    private int priceForSell, priceForBuy;

    public void changeCheck(int price) {
        if (price <= priceForBuy && price <= account.getCash()) {
            account.takeCash(price);
        }
        if (price >= priceForSell) {
            account.putCash(price);
        }
    }


}
