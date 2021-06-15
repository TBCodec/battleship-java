package com.codecool.battleship;

import java.util.Random;
import java.util.Scanner;

public class Battleship {
    //placement phase method goes here
    public static char[][] map = new char[5][5];
    public static char[][] test = new char[8][4];
    public static char[][] test2 = new char[10][10];

    public static char InputChar(String message) {
        //message method that asks for an input and then returns it
        return 'a';
    }
    // static Player1Phase {
    public static void main(String[] args) {
        System.out.println("Player 1, its your turn");
        createMatrix(map);
        printMatrix(map);

        ShootingPhase shot = new ShootingPhase(map);
        shot.shotHits(4,4);

        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Set the row, coloumn and  direction");
        String RowInput = input.nextLine();
        String ColoumnInput = input.nextLine();

        String DirectionInput = input.nextLine();

        int ColoumnInputNumber = Integer.parseInt(ColoumnInput);

        //if the choice is not correct, display an error message saying that the choices arent correct
        //If user wants to place two ships next to each other then error message is displayed//


    }

    public static void createMatrix(char[][] board){
        for(int i = 0; i < board.length; i ++){
            for(int j = 0; j < board[i].length; j ++) {
                board[i][j] = '0';
            }
        }
    }

    public static void printMatrix(char[][] board){
        String backSpaces = "  ";
        int[] rowNames = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        char[] coloumNames = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        for(int i = 0; i < board[0].length; i ++) {
            if(i == 0) System.out.print("   "+rowNames[i] + backSpaces);
            else System.out.print(+rowNames[i] + backSpaces);
        }
        System.out.println();
        for(int i = 0; i < board.length; i ++){
            for (int j = 0; j < board[i].length; j ++){
                if(j == 0){
                    System.out.print(coloumNames[i]+backSpaces+board[i][j]+backSpaces);
                }
                else System.out.print(board[i][j]+backSpaces);
            }
            System.out.println();
        }
        System.out.println();
    }

}
