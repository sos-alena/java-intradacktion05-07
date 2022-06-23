package com.hilel.lesson15.chessgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ChessGame {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        List<ChessItem> chessItems = new ArrayList<>();

        String input;
        while (!(input = READER.readLine()).equals("stop")) {
            chessItems.add(createChessItem(input));
        }

        drawChessItems(chessItems);

        ChessBoard chessBoard = new ChessBoard();
        draw(chessBoard);

    }
    public static ChessItem createChessItem(String chessItemName) {
        return switch (chessItemName) {
            case "pawn" -> new Pawn();
            case "king" -> new King();
            case "queen" -> new Queen();
            default -> throw new IllegalArgumentException("Unknown chess item name " + chessItemName);
        };
    }

    private static void draw(Drawable drawable) {
        drawable.draw();
    }

    private static void drawChessItems(List<ChessItem> chessItems) {
        for (ChessItem chessItem : chessItems) {

            /*if (chessItem instanceof Drawable) {
                Drawable drawableChessItem = (Drawable) chessItem;
                drawableChessItem.draw();
            }*/

            chessItem.print();
            draw(chessItem);
        }
    }
}