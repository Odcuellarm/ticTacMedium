package com.company;

public class Player {

    //playerType
    //playerMark
    //playerDifficulty

    public Player(String playerType) {
        switch (playerType) {
            case ("user"):
                System.out.println("new player - user");
                break;
            case ("easy"):
                System.out.println("new player - easy");
                break;
            case ("medium"):
                System.out.println("new player - medium");
        }
    }

    public void playerMoves() {
        //this.playerType
        //if player type == AI

    }

}

class Easy extends Player{

    public Easy(String playerType) {
        super(playerType);
    }

    @Override
    public void playerMoves() {

    }
}

class Medium extends Player{

    public Medium(String playerType) {
        super(playerType);
    }

    @Override
    public void playerMoves() {

    }
}
