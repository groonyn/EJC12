package com.epam.hw2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;;
/**
 * Class TrafficLight taking numbers as input thru system input and giving Strings thru system output.
 * @autor Nikolay Grunin
 * @version 1.0
 */
public class TrafficLight {
    /**
     * Creates  method which takes
     * @param inputTime and shows the message
     **/
    public static void chooseLight(double inputTime) {
        if (inputTime % 10 < 3 & inputTime % 10 >= 1) {
            System.out.println("Red Light!");
        } else if (inputTime % 10 > 2 & inputTime % 10 < 6) {
            System.out.println("Yellow Light!");
        } else if (inputTime % 10 > 5 & inputTime % 10 <= 10 || inputTime % 10 == 0) {
            System.out.println("Green Light!");
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Please input minute: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double inputTime = Double.parseDouble(reader.readLine());
        TrafficLight.chooseLight(inputTime);
        }

    }