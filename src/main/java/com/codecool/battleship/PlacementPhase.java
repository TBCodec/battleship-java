package com.codecool.battleship;

import java.util.Scanner;

public class PlacementPhase {


    public static void main(String[] args) {
/*
    int coordinateX = 2;
    int coordinateY = 3;
        do {
            // add meg egy egyes hajót koordinátáit
            // int[] coordinates = getShipCoordinates();
            coordinateX = Integer.parseInt(inputStr("x: "))-1;
            System.out.println();
            coordinateY = Integer.parseInt(inputStr("y: "))-1;
            System.out.println();
            if (canPlace(Battleship.map1,coordinateX, coordinateY)){
                Battleship.map1[coordinateX][coordinateY] = 'X';
            } else {
                System.out.println("Ide nem tudom letenni. ");
            };
            printMatrix(Battleship.map1);
        }
        while (!inputStr("Folytassuk? I/N: ").equals("n")) ;
        //*/

    }

    public static boolean isThereAnything (char[][] actualBoard,int x, int y){
        // ellenőrizzük, van-e a célponton hajó
        boolean canPlace = false;
        x -= 1;
        y -= 1;
        if (actualBoard[x][y] == '0') {
            canPlace = true;
        }
        return canPlace;
    }


    public static boolean hasNeighbour(char[][] actualBoard, int x, int y){
        // ellenőrizzük, van-e a célpont szomszédságában hajó
        boolean canPlace = false;

        if (directionOfShip(actualBoard, x, y) == '0') {
            canPlace = true;
        } else {
            canPlace = false;
        }

        return canPlace;
    }

    public static boolean canPlace(char[][] actualBoard, int x, int y) {
        // ellenőrizzük, lerakhatjuk-e a táblára a hajót

        boolean canPlace;

        canPlace = ( isThereAnything(actualBoard,x, y) && hasNeighbour(actualBoard,x,y));
        return canPlace;
    }

    public static char directionOfShip(char[][] actualBoard, int x, int y) {
        x -= 1;
        y -= 1;
        char directionOfShip = '0';
        boolean onTheRight;
        boolean onTheLeft;
        boolean onTheBottom;
        boolean onTheTop;

        try {
            onTheBottom = actualBoard[x+1][y] != '0';
        } catch (Exception e) {
            onTheBottom = false;
        }

        try {
            onTheTop = actualBoard[x-1][y] != '0';
        } catch (Exception e) {
            onTheTop = false;
        }

        try {
            onTheLeft = actualBoard[x][y-1] != '0';
        } catch (Exception e) {
            onTheLeft = false;
        }

        try {
            onTheRight = actualBoard[x][y+1] != '0';

        } catch (Exception e) {
            onTheRight = false;
        }
        if (onTheTop) directionOfShip = 'N';
        if (onTheBottom) directionOfShip = 'S';
        if (onTheLeft) directionOfShip = 'W';
        if (onTheRight) directionOfShip = 'E';
        return directionOfShip;
    }


    public static boolean placeSingleShip(char[][] actualBoard, int x, int y){
        // elhelyezünk egy egyes hajót a megfelelő helyre
        // ha nem lehet lerakni, false értékkel tér vissza

        boolean done;
        if (canPlace(actualBoard,x,y)) {
            actualBoard[x][y] = 'X';
            done = true;
        } else done= false;
        return done;
    }

    public boolean placeDoubleShip(char[][] actualBoard, int x1, int y1,int x2, int y2){
        // elhelyezünk egy dupla hajót a megfelelő helyre
        // ha nem lehet lerakni, false értékkel tér vissza

        boolean done;
        if (canPlace(actualBoard,x1,y1) && canPlace(actualBoard,x2,y2)) {
            actualBoard[x1-1][y1-1] = 'X';
            actualBoard[x2-1][y2-1] = 'X';
            done = true;
        } else done= false;
        return done;
    }


    public static String inputStr(String question) {
        // kiírja a kérdést, majd beolvas egy inputot
        System.out.print(question);
        Scanner keyboardInput = new Scanner(System.in);
        return keyboardInput.nextLine();
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