package com.epam.hw4;

import java.util.*;

public class Race {

    private static final int RANGE = 10;
    private static List<Horse> horses;
    private Horse winner;

    private Map<String, String> bet;

    Race(List<Horse> horses) {
        Race.horses = horses;
    }

    public static List<Horse> getHorses() {
        return Race.horses;
    }

    void run() {
        Random random = new Random();
        List<Integer> speedArray = new ArrayList<>();

        for (Horse horse : horses) {
            horse.setSpeed(horse.getSpeed() + random.nextInt(RANGE));
            speedArray.add(horse.getSpeed());
        }

        int maxSpeed = Collections.max(speedArray);

        for (Horse horse : horses) {
            if (horse.getSpeed() == maxSpeed) {
                winner = horse;
            }
        }
    }

    Horse getWinner() {
        return winner;
    }

    void makeBet(Map<String, String> bet) {
        this.bet = bet;
    }
}