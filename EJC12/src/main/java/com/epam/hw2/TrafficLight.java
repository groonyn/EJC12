package com.epam.hw2;

import java.io.IOException;

/**
 * Class TrafficLight taking numbers as input thru system input and giving Strings thru system output.
 *
 * @author Nikolay Grunin
 * @version 1.0
 */
public class TrafficLight {
    public static int enteringMinute(String inputMinute) {
        try {
            return Integer.parseInt(inputMinute);
        } catch (NumberFormatException e) {
            System.err.println("Number is negative or not Integer");
        }
        throw new NullPointerException("Not a positive integer number");
    }

    /**
     * Creates  method which takes
     *
     * @param inputMinute and gives back string from chooseLight
     **/

    public static String chooseLight(String inputMinute) throws IOException {
        int minuteNumber = enteringMinute(inputMinute);
        String lightColour = new String();
        if (minuteNumber % 10 < 3 & minuteNumber % 10 >= 1) {
            lightColour = "Red Light!";
        } else if (minuteNumber % 10 > 2 & minuteNumber % 10 < 6) {
            lightColour = "Yellow Light!";
        } else if (minuteNumber % 10 > 5 & minuteNumber % 10 <= 10 || minuteNumber % 10 == 0) {
            lightColour = "Green Light!";
        } else {
            throw new NullPointerException("Not a positive integer number");
        }
        return lightColour;
    }
}
