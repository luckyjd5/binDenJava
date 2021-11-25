package com.company;

import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String again = "Y";
        do {
            int notBin = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a binary number:");
            String initBin = input.next();
            // Scanner created to get user input and the user enters a binary number
            int totalDen = 0;
            String newBin = "";
            // Inits variables for a total denary number and one to reverse the inputted binary number
            for (int i = (initBin.length() - 1); i > -1; i--) {
                newBin += initBin.charAt(i);
                // Goes backwards through initial binary number and adds it to a string, therefore reversing it
                char d = initBin.charAt(i);
                int curVal = Integer.parseInt(String.valueOf(d));
                if (curVal != 1 && curVal != 0) {
                    notBin = 1;
                }
            }
            if (notBin == 1) {
                System.out.println("Not a binary number.\nTry again.");
            } else {
                for (int i = 0; i < initBin.length(); i++) {
                    char c = newBin.charAt(i);
                    int currVal = Integer.parseInt(String.valueOf(c));
                    // Saves the current value being parsed as an int
                    if (currVal == 1) {
                        totalDen += (Math.pow(2, i));
                        // Checks if the current value is 1, therefore needing to be powered.
                        // To add the denary power, i is used to power 2 as the original binary is reversed, i represents the correct power
                    }
                }

                System.out.println("Total: " + totalDen);
                System.out.println("\nWould you like to go again? Y/N");
                again = input.next();
            }
        } while (again.equalsIgnoreCase("Y"));
    }
}
