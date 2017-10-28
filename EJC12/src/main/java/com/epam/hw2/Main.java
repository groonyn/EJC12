package com.epam.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int enterMinute;
    public static void main(String[] args) throws IOException {
    System.out.println("Enter minute: ");
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // все классы и методы , что ниже в мэйн методе и классе не должны быть, трай и кэтч , все это должнобыт ьв
        // отдельных классах, доделат ьэто задание , переделать мейн - вывест ивсе в другие классы, а также тесты..
        // тесты написать через ассерт иккуалз
    String enteredMinute = reader.readLine();
    try {
        enterMinute = Integer.parseInt(enteredMinute);
    } catch (IllegalArgumentException enterMinute) {
        throw new IllegalArgumentException("You entered not integer number ");
    }
        System.out.println(TrafficLight.chooseLight(enterMinute));

        }
    }

