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
     * Creates main method which takes string as argument
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Please input minute: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double time = Double.parseDouble(reader.readLine());
        if (time % 10 < 3 & time % 10 >= 1) {
            System.out.println("Red Light!");
        } else if (time % 10 > 2 & time % 10 < 6) {
            System.out.println("Yellow Light!");
        } else if (time % 10 > 5 & time % 10 <= 10 || time % 10 == 0 ){
            System.out.println("Green Light!");
            }
        }
    }