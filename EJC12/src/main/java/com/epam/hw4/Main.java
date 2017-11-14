package com.epam.hw4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static ArrayList<Horse> horses = new ArrayList<>();

    public static void main(String[] args) {

        Player player = new Player("Nick", 1000);
        Horse redHorse = new Horse("Red Horse", 5);
        Horse blackHorse = new Horse("Black Horse", 10);
        Horse whiteHorse = new Horse("White Horse", 20);
        Horse brownHorse = new Horse("Brown Horse", 1);
        horses.add(redHorse);
        horses.add(blackHorse);
        horses.add(whiteHorse);
        horses.add(brownHorse);

        Hippodrome hippodrome = new Hippodrome(horses);

        Console.read();
        Map<String, String> bet = Console.getBet();

        hippodrome.runRace(bet);
        Horse winner = hippodrome.getWinner();

        if (winner.getName().equals(bet.get("horse"))) {
            player.increaseBalance(Integer.parseInt(bet.get("bet")));
        } else {
            player.decreaseBalance(Integer.parseInt(bet.get("bet")));
        }

        Console.getFinalBalance(player);
    }
}