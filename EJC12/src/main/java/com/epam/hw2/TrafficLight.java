package com.epam.hw2;
/**
 * Class TrafficLight taking numbers as input thru system input and giving Strings thru system output.
 * @author Nikolay Grunin
 * @version 1.0
 */
public class TrafficLight {
    /**
     * Creates  method which takes
     *
     * @param enterMinute and gives back string from chooseLight
     **/
    public static String light;


    public String chooseLight(int enterMinute) {
        if (enterMinute % 10 < 3 & enterMinute % 10 >= 1) {
            return light = "Red Light!";
        } else if (enterMinute % 10 > 2 & enterMinute % 10 < 6) {
            return light = "Yellow Light!";
        } else if (enterMinute % 10 > 5 & enterMinute % 10 <= 10 || enterMinute % 10 == 0) {
            return light = "Green Light!";
        } else
            return light = "Negative number!";
    }
}
