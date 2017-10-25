package com.epam.hw2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main (String[] args) throws IOException{
        System.out.println("Enter minute: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double inputTime = Double.parseDouble((reader.readLine()));
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.chooseLight(inputTime);
    }
}
