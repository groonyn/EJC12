package com.epam.hw4;

public class Horse {

    private String horseName;
    private int speed;

    Horse (String horseName, int speed){
        this.horseName = horseName;
        this.speed = speed;
    }
    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
