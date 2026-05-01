package com.tictactoe;

import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static boolean placeMove(int row, int col, char symbol) {

        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            System.out.println("Invalid position!");
            return false;
        }

        if (board[row][col] != ' ') {
            System.out.println("Cell already occupied!");
            return false;
        }

        board[row][col] = symbol;
        return true;
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("--+---+--");
            }
        }
    }

    public static void main(String[] args) {

        initializeBoard();

        placeMove(0, 0, 'X');
        placeMove(1, 1, 'O');

        printBoard();
    }
}