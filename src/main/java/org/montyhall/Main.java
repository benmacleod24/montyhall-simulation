package org.montyhall;


import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

     static public boolean isDebug = false;

    static public void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int numOfSimulations;
        boolean shouldSwitch;

        int numOfWins = 0;
        int numOfWinSwitched = 0;

        // Ask how many times to run the simulation.
        System.out.print("How many times would you run the simulation?: ");
        numOfSimulations = scan.nextInt();

        // Ask if the simulation should switch.
        System.out.print("Should simulation switch answer?: ");
        shouldSwitch = scan.nextBoolean();

        // Perform simulation.
        for (int i = 1; i <= numOfSimulations; i++) {
            boolean didWin = runSimulation(shouldSwitch);

            // Add to win counters.
            if (shouldSwitch && didWin) numOfWinSwitched++;
            if (!shouldSwitch && didWin) numOfWins++;
        }

        // Win Ratio
        int numerator = numOfWins;
        int denominator = numOfSimulations;
        if (shouldSwitch) numerator = numOfWinSwitched;
        int gcd = _GCD(numerator, denominator);

        // Complete reduction.
        numerator = numerator / gcd;
        denominator = denominator / gcd;

        // Win Percentage.
        float averageWins = (((float) numerator) / ((float) denominator)) * 100;

        // Display Results.
        System.out.println();
        System.out.println("Number of Wins (When Switched): " + numOfWinSwitched);
        System.out.println("Number of Wins (When NOT Switched): " + numOfWins);
        System.out.println("Win Percentage: " + Math.round(averageWins) + "%");
        System.out.println("Ratio Wins: " + numerator + "/" + denominator);


    }

    static  public int _GCD(int a, int b) {
        return b == 0 ? a : _GCD(b, a % b);
    }

    static public boolean runSimulation(boolean shouldSwitch) {
        Random ran = new Random();

        int winningDoor = ran.nextInt(3) + 1;
        int confirmedLossDoor = ran.nextInt(3) + 1;

        int selectedDoor = ran.nextInt(3) + 1;

        // Make sure confirmed loss door isn't the winning one and not the selected one.
        while (confirmedLossDoor == winningDoor || confirmedLossDoor == selectedDoor) {
            confirmedLossDoor = ran.nextInt(3) + 1;
        }

        // Display pre-switch data.
        if (isDebug) {
            System.out.println("Winning: " + winningDoor);
            System.out.println("Confirmed Loss: " + confirmedLossDoor);
            System.out.println("Selected: " + selectedDoor);

        }

        // If simulation should switch, loop through until it's correct value.
        if (shouldSwitch) {
            int oldSelection = selectedDoor;
            while (oldSelection == selectedDoor || selectedDoor == confirmedLossDoor) {
                selectedDoor = ran.nextInt(3) + 1;
            }
        }

        // Display post-switch data.
        if (isDebug) {
            System.out.println("Winning: " + winningDoor);
            System.out.println("Confirmed Loss: " + confirmedLossDoor);
            System.out.println("Selected: " + selectedDoor);

        }

        // Return if it was a winning suggestion.
        return selectedDoor == winningDoor;

    }
}