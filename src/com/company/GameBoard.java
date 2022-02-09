package com.company;

import java.util.Scanner;

public class GameBoard {

    //create empty gameBoard
    //update empty gameBoard
    //report a winner
    static char[][] ticTac;
    static int length;
    private GameStatus gameStatus;
    //Scanner scanner = new Scanner(System.in);
    String[] playerOne; // [typeOfPlayer, mark]
    String[] playerTwo; // [typeOfPlayer, mark]

    enum GameStatus {
        X_WINS,
        O_WINS,
        DRAW,
        GAME_CONTINUES
    }

    public GameBoard() {
        this.ticTac = new char[][]{{' ', ' ', ' '},{' ', ' ', ' '},{' ', ' ', ' '}};
        this.length = this.ticTac.length;
        this.gameStatus = GameStatus.GAME_CONTINUES;
    }

    public static void printGameBoard() {
        System.out.print("---------");
        System.out.printf("%n| %c %c %c |", ticTac[0][0], ticTac[0][1], ticTac[0][2] );
        System.out.printf("%n| %c %c %c |", ticTac[1][0], ticTac[1][1], ticTac[1][2] );
        System.out.printf("%n| %c %c %c |", ticTac[2][0], ticTac[2][1], ticTac[2][2] );
        System.out.printf("%n---------%n");
    }

    public static char getGameBoardCell(int x, int y) {
        return ticTac[x - 1][y -1];
    }

    public static void updateGameBoard(int x, int y, char mark) {
        ticTac[x - 1][y - 1] = mark;
    }

    public static void checkForWinner(char mark, int numOfMarks) {
        int diagonalRtoL = 0;
        int diagonalLtoR = 0;
        int[] columns = {0, 0, 0};
        int[] rows = {0, 0, 0};

        int enemyDiagonalRtoL = 0;
        int enemyDiagonalLtoR = 0;
        int[] enemyColumns = {0, 0, 0};
        int[] enemyRows = {0, 0, 0};

        char yourMark = mark;
        char enemyMark;
        char[] possibleTriplet;

        String winner;
        boolean weHaveWinner = false;

        enemyMark = yourMark == 'X' ? 'O' : 'X';

        /*
          the next 2-loops search for a triplet with two similar marks for both
          winning or loosing scenarios (prioritizing winning).
        */
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {

                if (ticTac[i][j] == yourMark) {
                    rows[i]++;
                    if (rows[i] == numOfMarks) {
                        possibleTriplet = ticTac[i].clone();
                        break;
                    }
                } else if (ticTac[i][j] == enemyMark) {
                    enemyRows[i]++;
                    if (enemyRows[i] == numOfMarks) {
                        possibleTriplet = ticTac[i].clone();
                        break;
                    }
                }

                if (ticTac[j][i] == yourMark) {
                    columns[i]++;
                    if (columns[i] == numOfMarks) {
                        possibleTriplet = new char[]{ticTac[0][i], ticTac[1][i], ticTac[2][i]};

                        break;
                    }
                } else if (ticTac[j][i] == enemyMark) {
                    enemyColumns[i]++;
                    if (enemyColumns[i] == numOfMarks) {
                        possibleTriplet = new char[]{ticTac[0][i], ticTac[1][i], ticTac[2][i]};
                        break;
                    }
                }

                if (i == j && ticTac[i][j] == yourMark) {
                    diagonalLtoR++;
                    if (diagonalLtoR == numOfMarks) {
                        possibleTriplet = new char[]{ticTac[0][0], ticTac[1][1], ticTac[2][2]};
                        break;
                    }
                } else if (i == j && ticTac[i][j] == enemyMark) {
                    enemyDiagonalLtoR++;
                    if (enemyDiagonalLtoR == numOfMarks) {
                        possibleTriplet = new char[]{ticTac[0][0], ticTac[1][1], ticTac[2][2]};
                        break;
                    }
                }

                if (i + j == 2 && ticTac[i][j] == yourMark) {
                    diagonalRtoL++;
                    if (diagonalRtoL == numOfMarks) {
                        possibleTriplet = new char[]{ticTac[0][2], ticTac[1][1], ticTac[2][0]};
                        break;
                    }
                } else if (i + j == 2 && ticTac[i][j] == enemyMark) {
                    enemyDiagonalRtoL++;
                    if (enemyDiagonalRtoL == numOfMarks) {
                        possibleTriplet = new char[]{ticTac[0][2], ticTac[1][1], ticTac[2][0]};
                        break;
                    }
                }
            }
        }

        //get the row/column/diag#, get the elements of row/colum/diag, find the empty space and return coordiantes
    }

    public static void checkForWinner(char mark) {
        int diagonalRtoL = 0;
        int diagonalLtoR = 0;
        int[] columns = {0, 0, 0};
        int[] rows = {0, 0, 0};
        String winner;
        boolean weHaveWinner = false;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (ticTac[i][j] == mark) {
                    rows[i]++;
                }
                if (ticTac[j][i] == mark) {
                    columns[i]++;
                }
                if (i == j && ticTac[i][j] == mark) {
                    diagonalLtoR++;
                }
                if (i + j == 2 && ticTac[i][j] == mark) {
                    diagonalRtoL++;
                }
            }
        }
        //check for int = 3
        if (diagonalLtoR == length || diagonalRtoL == length) {

        } else if (rows[0] == length || rows[1] == length || rows[2] == length) {
            //set status
        } else if (columns[0] == length || columns[1] == length || columns[2] == length) {
            //set status
        }
        //return status and coordinates

        //get the row/column/diag#, get the elements of row/colum/diag, find the empty space and return coordiantes
    }


}
