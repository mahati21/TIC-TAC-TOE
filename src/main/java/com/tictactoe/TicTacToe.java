package com.tictactoe;

import java.util.Scanner;
import java.util.Random;

public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    static char humanSymbol = 'X';
    static char computerSymbol = 'O';

    public static void main(String[] args) {

        printBoard(); // show initial board

        while (!gameOver) {

            if (isHumanTurn) {
                playerMove();
            } else {
                computerMove();
            }

            printBoard();

            if (checkWin()) {
                if (isHumanTurn) {
                    System.out.println("Human wins!");
                } else {
                    System.out.println("Computer wins!");
                }
                gameOver = true;
            }
            else if (isBoardFull()) {
                System.out.println("It's a draw!");
                gameOver = true;
            }
            else {
                isHumanTurn = !isHumanTurn;
            }
        }
    }

    static void playerMove() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter position (1-9): ");
            int slot = sc.nextInt();

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (slot >= 1 && slot <= 9 && board[row][col] == '-') {
                board[row][col] = humanSymbol;
                break;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }

    static void computerMove() {
        Random rand = new Random();

        while (true) {
            int slot = rand.nextInt(9) + 1;

            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (board[row][col] == '-') {
                board[row][col] = computerSymbol;
                break;
            }
        }

        System.out.println("Computer placed '" + computerSymbol + "'");
    }

    static void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " " + board[i][1] + " " + board[i][2]);
        }
        System.out.println();
    }

    static boolean checkWin() {

        for (int i = 0; i < 3; i++) {

            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return true;

            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return true;
        }

        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return true;

        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return true;

        return false;
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}