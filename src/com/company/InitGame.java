package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class InitGame {
    //INIT GAME ++++++++++++++++++++++
    private InitGame() {
    }

    static void startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean isAllSet = false;
        String[] inputs;

        do {
            System.out.println("Input command: ");
            inputs = scanner.nextLine().split(" ");
            System.out.println(Arrays.toString(inputs));
            if (isValidInput(inputs)) {
                launchGame(inputs[1], inputs[2]);
                isAllSet = true;
            }
        } while (!isAllSet);
    }

    static void launchGame(String playerOne, String playerTwo) {

        //instantiate player one
        //instantiate player two
        //instantiate GameBoard

        //boolean gameContinues = true;
        //ticTacGame ticTac = new ticTacGame();
        //ticTac.setPlayers(playerOne, playerTwo);
        //ticTacPrinter.printGameCanvas(ticTac.getTicTac());
        //String gameStatus;

        /*
        while(gameContinues) {
            //playerOne moves
            ticTac.playerMoves(ticTac.getPlayerOne());
            ticTacPrinter.printGameCanvas(ticTac.getTicTac());
            ticTac.updateGameStatus();
            gameStatus = ticTac.getGameStatus();
            switch (gameStatus) {
                case ("X-wins"):

            }
            ticTacPrinter.printGameStatus(ticTac.getGameStatus());

            ticTac.playerMoves(ticTac.getPlayerTwo());
            ticTacPrinter.printGameCanvas(ticTac.getTicTac());
            ticTac.updateGameStatus();
            ticTacPrinter.printGameStatus(ticTac.getGameStatus());
        }
        */
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

