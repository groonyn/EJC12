package com.epam.hw1;
import java.util.Scanner;
/**
 * Class InputOutput taking numbers as input thru system input and giving a string with answer.
 * @autor Nikolay Grunin
 * @version 1.0
 */
public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number for check: ");
        int scan;
        if (scanner.hasNextInt()) {
         scan =  scanner.nextInt();
            System.out.println("It is the integer");
        } else {
            System.out.println("It is not the integer");
        }
    }
}