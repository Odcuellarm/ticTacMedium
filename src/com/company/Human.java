package com.company;
import java.util.Scanner;

public class Human extends GameBoard implements Player {

    char playerMark;

    Human (char mark) {
        this.playerMark = mark;
    }
    @Override
    public void playerMoves() {
        Scanner scanner = new Scanner(System.in);
        String coordinates;
        do{
            System.out.print("Enter the coordinates: ");
            coordinates = scanner.nextLine();
        } while (!validateCoordinates(coordinates));

        //update gameBoard
    }

    public boolean validateCoordinates(String xy) {

        int x, y;

        try {
            x = Integer.parseInt(xy.substring(0, 1));
            y = Integer.parseInt(xy.substring(2));
        } catch (NumberFormatException e) {
            System.out.println("You should enter numbers!");
            return false;
        }

        if (x > 3 || y > 3 || x == 0 || y == 0) {
            System.out.println("Coordinates should be from 1 to 3!");
            return false;
        } else if (!availableCell(x, y)) {
            System.out.println("This cell is occupied! Choose another one!");
            return false;
        }
        return true;
    }

    public boolean availableCell(int x, int y) {

        return GameBoard.getGameBoardCell(x, y) == ' ';
    }
}
