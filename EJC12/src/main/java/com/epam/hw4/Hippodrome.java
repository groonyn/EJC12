package com.epam.hw4;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public Hippodrome(){
        Horse whiteHorse = new Horse("White Horse", 5);
        Horse blackHorse = new Horse("Black Horse", 10);
        Horse brownHorse = new Horse("Brown Horse", 20);
        Horse grayHorse = new Horse("Gray Horse", 1);
        List<Horse> horseList= new ArrayList<>();
        horseList.add(whiteHorse);
        horseList.add(blackHorse);
        horseList.add(brownHorse);
        horseList.add(grayHorse);
    }

}
// можно создать гонку, игрока, расстояние гонки
/*





 */