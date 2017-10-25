package com.epam.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int enterMinute;
    public static void main(String[] args) throws IOException {
    System.out.println("Enter minute: ");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String enteredMinute = reader.readLine();
    try {
        enterMinute = Integer.parseInt(enteredMinute);
    } catch (IllegalArgumentException enterMinute) {
        System.out.println("You entered not integer number ");
    }
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.chooseLight(enterMinute);
        System.out.println(TrafficLight.light);
        }
    }

