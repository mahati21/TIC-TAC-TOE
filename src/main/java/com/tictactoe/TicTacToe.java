package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {

    // Method to read slot input (1–9)
    public static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
    }

    public static void main(String[] args) {
        int chosenSlot = getUserSlot();
        System.out.println("You selected slot: " + chosenSlot);
    }
}
