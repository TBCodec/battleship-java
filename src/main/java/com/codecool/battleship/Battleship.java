package com.codecool.battleship;

import java.util.Random;
import java.util.Scanner;

public class Battleship {
    //placement phase method goes here
    public static char[][] map = new char[5][5];
    public static int[] rowNames = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static char[] coloumNames = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};

    public static void UserInput() {
        String inputCharacters;
        boolean inputIsValid = false;
        do{

            inputCharacters =  inputStr("Adja meg a kívánt pozíciókat! (pl A-1)");
            if(inputCharacters.length() == 4 || inputCharacters.length() == 3) {
                if(inputCharacters.substring(1,2).equals("-")) {
                    if(isNum(inputCharacters.substring(0,1))) {
                        if(!isNum(inputCharacters.substring(2,3))) {
                            inputIsValid = true;

                        }
                    }
                }
            }
        }while(!inputIsValid);








    }







    public static String inputStr(String question) {
        System.out.println(question);
        Scanner keyboardInput = new Scanner(System.in);
        return keyboardInput.nextLine();

        // static Player1Phase {

    }








    public static void main(String[] args) {

        createMatrix(map);
        printMatrix(map);

        ShootingPhase shot = new ShootingPhase(map);
        shot.shotHits(4, 4);

        UserInput();


        //if the choice is not correct, display an error message saying that the choices arent correct
        //If user wants to place two ships next to each other then error message is displayed//







        }
       //System.out.println(" Next player's placement phase);

    //System.out.println("Next player placement phase...");
    public static void createMatrix(char[][] board){
        for(int i = 0; i < board.length; i ++){
            for(int j = 0; j < board[i].length; j ++) {
                board[i][j] = '0';
            }
        }
    }

    public static void printMatrix(char[][] board){
        String backSpaces = "  ";

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
    public static boolean isNum(String s){
        boolean stat;
        if(s != null)
        {
            try {
                Float.parseFloat(s);
                stat = true;
            }
            catch (NumberFormatException nfe) {
                stat = false;
            }
        }
        else return true;
        return !stat;
    }

}

