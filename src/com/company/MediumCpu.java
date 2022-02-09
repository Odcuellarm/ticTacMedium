package com.company;

public class MediumCpu implements Player {

    char playerMark;

    MediumCpu(char mark) {
        this.playerMark = mark;
    }

    @Override
    public void playerMoves() {
        System.out.println("Making move level \"medium\"");
        //GameBoard.checkForWinner(YourMark, 2)
            //if winner -->
            //update coordinates
        GameBoard.checkForWinner(this.playerMark, 2);
        //GameBoard.checkForWinner(OppMark, 2)
            //if winner -->
            //update coordinates
        //else randomMove
            //update coordinates
        //

    }
}
