/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Grafton
 */

import java.util.Scanner;
public class Assignment_1_Exercise_4 {
    public static void main(String[] args) {


        Scanner keyboardInput = new Scanner(System.in);

        /* Asking user to enter noun*/
        System.out.print("Enter a noun: ");
        String noun = keyboardInput.nextLine();

        /* Asking user to enter verb*/
        System.out.print("Enter a verb: ");
        String verb = keyboardInput.nextLine();

        /* Asking user to enter adjective*/
        System.out.print("Enter an adjective: ");
        String adjective = keyboardInput.nextLine();

        /* Asking user to enter adverb*/
        System.out.print("Enter an adverb: ");
        String adverb = keyboardInput.nextLine();

        /* Printing out final output*/
        System.out.println("Do you " + noun + " " + verb + " " + adjective + " " + adverb + "? That's hilarious!");

    }
}
