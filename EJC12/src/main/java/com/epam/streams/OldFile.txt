package com.epam.hw4;
import java.util.ArrayList;
import java.util.Map;
public class Hippodrome {

    private Race race;
    public ArrayList<Horse> horses;

    public Hippodrome(ArrayList<Horse> horses){
        this.horses = horses;
    }
    public void runRace(Map<String, String> bet) {
        race = new Race(horses);
        race.makeBet(bet);
        race.run();
    }

    public Horse getWinner() {
        return race.getWinner();
    }
}