import com.epam.hw4.Console;
import com.epam.hw4.Hippodrome;
import com.epam.hw4.Horse;
import com.epam.hw4.Player;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Nick", 1000);
        Hippodrome hippodrome = new Hippodrome();

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