package com.epam.hw4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Console {

    private static final String USAGE =
            "Usage: [-r count -h horse] [-b] [-ha] [q] [help]\n";
    private static final String OPTIONS =
            "-r count -h horse    make a rate on the horse\n" +
                    "-b                   get the balance of money\n" +
                    "-ha                  show all the horses\n" +
                    "help                 show usage\n" +
                    "quit                 quit\n";

    private static Map<String, String> bet = new HashMap<>();

    public static void read() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(USAGE);
        System.out.println(OPTIONS);
        while (true) {
            String s = null;
            try {
                s = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (s.contains("-r") && s.contains("-h")) {
                Matcher m = Pattern.compile("-r (.*) -h (.*)").matcher(s);
                if (m.find()) {
                    String rate = m.group(1);
                    String horse = m.group(2);
                    bet.put("horse", horse);
                    bet.put("bet", rate);
                    System.out.println(String.format("You made the bet: %s -> %s", bet.get("horse"), bet.get("bet")));
                    break;
                }
            }
            if (s.equals("-ha")) {
                System.out.println("Horses:");
                for (Horse horse : Race.getHorses()) {
                    System.out.println(String.format("%s -> speed: %s", horse.getName(), horse.getSpeed()));
                }
            }
            if (s.equals("help")) {
            }
            if (s.equals("quit")) {
                System.out.println("Exit...");
                System.exit(0);
            }
        }
    }

    public static Map<String, String> getBet() {
        return bet;
    }

    public static void getFinalBalance(Player player) {
        System.out.println(String.format("Your current balance is: %s", player.getBalance()));
    }
}