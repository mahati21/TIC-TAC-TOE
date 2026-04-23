package com.tictactoe;

import java.util.Random;

public class TicTacToe {

    static String currentPlayer;
    static char player1Symbol;
    static char player2Symbol;


    public static void tossAndAssign() {
        Random random = new Random();

        int toss = random.nextInt(2); // 0 or 1

        if (toss == 0) {
            currentPlayer = "Player 1";
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = "Player 2";
            player1Symbol = 'O';
            player2Symbol = 'X';
        

        System.out.println("Toss Result: " + toss);
        System.out.println(currentPlayer + " will start first!");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }

    public static void main(String[] args) {
        System.out.println("Starting Tic-Tac-Toe Game...\n");

        tossAndAssign();
    }
}
