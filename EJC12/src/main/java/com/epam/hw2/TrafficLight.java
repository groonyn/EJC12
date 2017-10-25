package com.epam.hw2;
/**
 * Class TrafficLight taking numbers as input thru system input and giving Strings thru system output.
 * @author Nikolay Grunin
 * @version 1.0
 */
public class TrafficLight {
    /**
     * Creates  method which takes
     * @param inputTime and gives back string from chooseLight
     **/
    public void chooseLight(double inputTime) {
        if (inputTime % 10 < 3 & inputTime % 10 >= 1) {
            System.out.println("Red Light!");
        } else if (inputTime % 10 > 2 & inputTime % 10 < 6) {
            System.out.println("Yellow Light!");
        } else if (inputTime % 10 > 5 & inputTime % 10 <= 10 || inputTime % 10 == 0) {
            System.out.println("Green Light!");
        }
    }
}
