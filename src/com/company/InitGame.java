package com.company;
import java.util.Scanner;

public class InitGame {
    //INIT GAME ++++++++++++++++++++++
    static Player playerOne;
    static Player playerTwo;

    private InitGame() {
    }

    static void startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean isAllSet = false;
        String[] inputs;

        do {
            System.out.println("Input command: ");
            inputs = scanner.nextLine().split(" ");
            if (isValidInput(inputs)) {
                setPlayers(inputs[1], inputs[2]);
                GameBoard gameBoard = new GameBoard();
                isAllSet = true;
            }
        } while (!isAllSet);
    }

    static void launchGame() {
        boolean winner = false;

        GameBoard.printGameBoard(); //print empty game board

        while(!winner) {
            playerOne.playerMoves();

            playerTwo.playerMoves();
        }
    }

    static void setPlayers(String firstPlayer, String secondPlayer) {

        switch (firstPlayer) {
            case "user":
                playerOne = new Human('X');
                break;
            case "easy":
                playerOne = new EasyCpu('X');
                break;
            case "medium":
                playerOne = new MediumCpu('X');
                break;
        }

        switch (secondPlayer) {
            case "user":
                playerTwo = new Human('O');
                break;
            case "easy":
                playerTwo = new EasyCpu('O');
                break;
            case "medium":
                playerTwo = new MediumCpu('O');
                break;
        }
    }

    static boolean isValidInput(String[] inputs) {

        boolean isValidInput = false;
        int length = inputs.length;

        if (inputs[0].equals("exit") && length == 1) {
            System.exit(1);
        } else if (inputs[0].equals("start") && length == 3) {
            if (inputs[1].equals("user") || inputs[1].equals("easy") || inputs[1].equals("medium")) {
                if (inputs[2].equals("user") || inputs[2].equals("easy") || inputs[2].equals("medium")) {
                    isValidInput = true;
                }
            }
        } else {
            System.out.println("Bad Parameters!");
        }
        return isValidInput;
    }
}

