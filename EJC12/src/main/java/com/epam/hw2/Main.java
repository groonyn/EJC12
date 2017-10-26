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
        throw new IllegalArgumentException("You entered not integer number ");
    }
        System.out.println(TrafficLight.chooseLight(enterMinute));

        }
    }

