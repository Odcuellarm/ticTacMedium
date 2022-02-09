package com.company;

import java.util.Random;

public class EasyCpu implements Player {

    char playerMark;

    EasyCpu(char mark) {
        this.playerMark = mark;
    }

    @Override
    public void playerMoves() {
        boolean validCell = false;
        int x = 0;
        int y = 0;

        Random random = new Random();
        System.out.println("Making move level \"easy\"");

        while(!validCell) {
            x = random.nextInt(3) + 1;
            y = random.nextInt(3) + 1;
            validCell = GameBoard.getGameBoardCell(x, y) == ' ';
        }
        GameBoard.updateGameBoard(x, y, playerMark);
    }

}
