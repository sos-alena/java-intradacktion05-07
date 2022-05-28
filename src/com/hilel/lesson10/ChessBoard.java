package com.hilel.lesson10;

public class ChessBoard {

    public static void main(String[] args) {

      char[][] chessBoard = new char[8][8];


        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    chessBoard[i][j] = 'B';

                } else {
                    chessBoard[i][j] = 'W';

                }
            }
        }

        for (char[] chars : chessBoard) {
            for (char Char : chars) {

                System.out.print("  " + Char);

            }
            System.out.println();
        }
    }
}