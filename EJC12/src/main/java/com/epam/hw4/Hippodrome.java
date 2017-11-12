package com.epam.hw4;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
public class Hippodrome {

    private Race race;

    public Hippodrome() {
        Horse redHorse = new Horse("Red Horse", 5);
        Horse blackHorse = new Horse("Black Horse", 10);
        Horse whiteHorse = new Horse("White Horse", 20);
        Horse brownHorse = new Horse("Brown Horse", 1);
        List<Horse> horses = new ArrayList<>();
        horses.add(redHorse);
        horses.add(blackHorse);
        horses.add(whiteHorse);
        horses.add(brownHorse);

        race = new Race(horses);
    }

    public void runRace(Map<String, String> bet) {
        race.makeBet(bet);
        race.run();
    }

    public Horse getWinner() {
        return race.getWinner();
    }
}