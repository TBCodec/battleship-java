package com.codecool.battleship;

import java.util.Scanner;

public class ShootingPhase {
    private char[][] map;

    public ShootingPhase(char[][] elements){
        map = elements;
        shotInput();
    }

    public static void main(String[] args) {
        char[][] map = new char[][]{
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', 'X'}
        };

        ShootingPhase shootingPhase = new ShootingPhase(map);

    }

    public void changePlayer(){
        shotInput();
    }

    public void changeInputToRowColumn(String input){
        int rowInt = 0;
        String row = String.valueOf(input.charAt(0));
        String column = String.valueOf(input.charAt(1));
        switch (row){
            case "A":
                rowInt = 0;
                break;

            case "B":
                rowInt = 1;
                break;

            case "C":
                rowInt = 2;
                break;

            case "D":
                rowInt = 3;
                break;

            case "E":
                rowInt = 4;
                break;

            default:
                System.out.println("Első koordináta nem A-E!");
                shotInput();
        }
        Integer col = isNumber(column);
        if (col != null) {
            col -= 1;
            shotHits(rowInt, col);
        } else {
            System.out.println("Második koordináta nem egy szám 1-5!");
            shotInput();
            }

    }

    public static Integer isNumber(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public void shotInput(){
        System.out.println("Add meg a koordinátákat A-E 1-5 (pl.: A3): ");
        Scanner input = new Scanner(System.in);
        changeInputToRowColumn(input.nextLine());
    }

    public void shotHits(int row, int column){

        System.out.println();
        if (row > 4 || column > 4){
            System.out.println("Invalid input!");
            shotInput();
            return;
        }
        if(map[row][column] == 'X'){
            System.out.println("Talált!");
        }
        else {
            System.out.println("Nem talált!");
        }

        Battleship board = new Battleship();
        board.printMatrix(map);

        changePlayer();
    }
}
