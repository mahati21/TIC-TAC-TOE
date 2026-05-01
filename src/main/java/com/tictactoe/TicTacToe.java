package com.tictactoe;

public class TicTacToe {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    public static void main(String[] args) {

        System.out.println(isDraw());

        board = new char[][]{
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };

        System.out.println(isDraw());
    }


    static boolean isDraw() {

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {

                if (board[r][c] == '-') {
                    return false;
                }
            }
        }

        return true;
    }
}