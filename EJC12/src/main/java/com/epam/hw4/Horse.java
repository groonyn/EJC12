package com.epam.hw4;

public class Horse {

    private String name;
    private int speed;

    Horse(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return this.name;
    }

    public int getSpeed() {
        return this.speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }
}