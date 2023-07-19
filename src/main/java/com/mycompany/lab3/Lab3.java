/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab3;

/**
 *
 * @author USER
 */
public class Lab3 {

    public static boolean checkRow(String[][] board, int row, int column, String turn) {
        for (int i = 0; i < 3; i++) {
            if (!board[row - 1][i].equals(turn)) {
                return false;
            }

        }
        return true;
    }

    public static boolean checkColumn(String[][] board, int row, int column, String turn) {
        for (int i = 0; i < 3; i++) {
            if (!board[i][column - 1].equals(turn)) {
                return false;
            }

        }
        return true;
    }

    public static boolean checkDiagonal(String[][] board, int row, int column, String turn) {
        if (row - 1 == column - 1) {
            for (int i = 0; i < 3; i++) {
                if (!board[i][i].equals(turn)) {
                    return false;
                }

            }
            return true;
        }
        if ((row + column) - 2 == 2) {
            for (int i = 0; i < 3; i++) {
                if (!board[i][2 - i].equals(turn)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean checkDraw(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals("-")) {
                    return false;
                }

            }

        }
        return true;
    }

    public static boolean checkWinner(String[][] board, int row, int column, String turn) {

        if (checkRow(board, row, column, turn) || checkColumn(board, row, column, turn) || checkDiagonal(board, row, column, turn)) {

            return true;

        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
