package com.epam.hw4;

public class Player {
    private String playerName;
    private int money = 10000;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void increaseMoney(int bet) {
        this.money = money + bet;
    }

    public void decreaseMoney(int bet) {
        this.money = money - bet;
    }
}
