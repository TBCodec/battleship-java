package com.codecool.battleship;

import java.util.Scanner;

public class Battleship {
    //placement phase method goes here
    public static char[][] map1 = new char[5][5];
    public static char[][] map2 = new char[5][5];
    public static char[][] shotMap1 = new char[5][5];
    public static char[][] shotMap2 = new char[5][5];
    public static char[][][] playersBoard = new char[2][][];
    public static int[] rowNames = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static String[] coloumNames = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    public static int x;
    public static int y;

    public static void main(String[] args) {
        createMatrix(map1);
        createMatrix(map2);
        createMatrix(shotMap1);
        createMatrix(shotMap2);
        UserInput();
        map1[x-1][y-1] = 'X';
        printMatrix(map1);
        UserInput();
        ShootingPhase sh = new ShootingPhase(map1, shotMap1);
        sh.shotHits(x,y);
        System.out.println("Ez a találati map:");
        printMatrix(shotMap1);
        System.out.println("Ez a hajó map:");
        printMatrix(map1);
        UserInput();
        map2[x-1][y-1] = 'X';
        printMatrix(map2);
    }

    public static int numberValidator(int num){
        boolean state = false;
        int result;
        for(int i = 0; i < rowNames.length; i ++){
            if(rowNames[i] == num){
                state = true;
            }
        }

        if(!state){
            result = -1;
            System.out.println(result);
            UserInput();
        } else {
            result = num;
            System.out.println(result);
        }
        return result;
    }

    public static int charValidator(String str){
        String upperChar = str.toUpperCase();
        int result = 0;
        boolean state = false;
        for (int i = 0; i < coloumNames.length; i ++) {
            if (upperChar.equals(coloumNames[i])) {
                state = true;
            }
        }
        if(!state){
            result = -1;
            System.out.println(result);
            UserInput();
            return result;
        } else {
            switch (upperChar){
                case "A":
                    result = 1;
                    break;
                case "B":
                    result = 2;
                    break;
                case "C":
                    result = 3;
                    break;
                case "D":
                    result = 4;
                    break;
                case "E":
                    result = 5;
                    break;
                case "F":
                    result = 6;
                    break;
                case "G":
                    result = 7;
                    break;
                case "H":
                    result = 8;
                    break;
                case "I":
                    result = 9;
                    break;
                case "J":
                    result = 10;
                    break;
            }
            System.out.println(result);
            return result;
        }
    }

    public static void UserInput() {
        String inputCharacters;
        boolean inputIsValid;
        do {
            inputIsValid = false;
            inputCharacters = inputStr("Adja meg a kívánt pozíciókat! (pl A-1)");
            if (inputCharacters.length() == 4 || inputCharacters.length() == 3) {
                if (inputCharacters.substring(1, 2).equals("-")) {
                    if (isNum(inputCharacters.substring(0, 1))) {
                        if (!isNum(inputCharacters.substring(2, 3))) {
                            inputIsValid = true;
                        }
                        else System.out.println("A második értéknek számnak kell lenni!");
                    }
                    else System.out.println("Az első értéknek betűnek kell lennie!");
                }
                else System.out.println("Érvénytelen pozíció!");
            }
            else System.out.println("Érvénytelen pozíció!");
        } while (!inputIsValid);
        //System.out.println(inputCharacters.substring(0,1));
        //System.out.println(inputCharacters.substring(2,3));
        x = charValidator(inputCharacters.substring(0,1));
        y = numberValidator(Integer.parseInt(inputCharacters.substring(2,3)));
//        PlacementPhase pp = new PlacementPhase();
//        pp.canPlace(map1,x,y);
    }

    public static String inputStr(String question) {
        System.out.println(question);
        Scanner keyboardInput = new Scanner(System.in);
        return keyboardInput.nextLine();
    }

    public static void createMatrix(char[][] board){
        for(int i = 0; i < board.length; i ++){
            for(int j = 0; j < board[i].length; j ++) {
                board[i][j] = '0';
            }
        }
    }

    public static void printMatrix(char[][] board){
        String spaces = "  ";
        for(int i = 0; i < board[0].length; i ++) {
            if(i == 0) System.out.print("   "+rowNames[i] + spaces);
            else System.out.print(+rowNames[i] + spaces);
        }
        System.out.println();
        for(int i = 0; i < board.length; i ++){
            for (int j = 0; j < board[i].length; j ++){
                if(j == 0){
                    System.out.print(coloumNames[i]+spaces+board[i][j]+spaces);
                }
                else System.out.print(board[i][j]+spaces);
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