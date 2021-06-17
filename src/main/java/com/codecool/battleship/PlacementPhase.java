package com.codecool.battleship;

import java.util.Scanner;

public class PlacementPhase {
/*
    public static char[][] map = new char[][]{
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'},
            {'0', '0', 'X', '0', '0'},
            {'0', '0', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
    };*/

    /*
    public static void main(String[] args) {

    int coordinateX = 2;
    int coordinateY = 3;



        do {
            coordinateX = Integer.parseInt(inputStr("x: "))-1;
            System.out.println();
            coordinateY = Integer.parseInt(inputStr("y: "))-1;
            System.out.println();
            // 2x
            // add meg egy kettes hajót koordinátáit
            // add meg az irányát
            // larakjuk a táblába a hajót
            // 2x
            // add meg egy egyes hajót koordinátáit
            // int[] coordinates = getShipCoordinates();
            // larakjuk a táblába a hajót
            if (canPlace(Battleship.map1,coordinateX, coordinateY)){
                Battleship.map1[coordinateX][coordinateY] = 'X';
            } else {
                System.out.println("Ide nem tudom letenni. ");
            };

            printMatrix(Battleship.map1);
        }
        while (!inputStr("Folytassuk? I/N: ").equals("n")) ;

        //

    }
    */

    // ellenőrizzük, lerakhatjuk-e a táblára a hajót
    //
    public boolean hasNeighbour(char[][] actualBoard, int x, int y){
        boolean canPlace = false;

            if (directionOfShip(actualBoard, x, y) == '0') {
                canPlace = true;
            } else {
                canPlace = false;
            }

        return canPlace;
    }

    public static boolean isThereAnything (char[][] actualBoard,int x, int y){
        boolean canPlace = false;
        x -= 1;
        y -= 1;
        if (actualBoard[x][y] == '0') {
            canPlace = true;
        }
        // actualBoard[x][y] = "X";
        return canPlace;
    }

    public boolean canPlace(char[][] actualBoard, int x, int y) {
        boolean canPlace;

        canPlace = ( isThereAnything(actualBoard,x, y) && hasNeighbour(actualBoard,x,y));
        return canPlace;
}
public char directionOfShip(char[][] actualBoard, int x, int y) {
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




    // add meg egy egyes hajót koordinátáit

 /*   public static int[] getShipCoordinates()
    {
        int row = inputStr("Melyik sor (A-E)");
        int col = inputStr("Melyik oszlop (1-5)");
        return row, col;
    }*/

    public static String inputStr(String question) {
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

 /*




    public static String validateInput(String input, String type, int size) {

        ;
        return keyboardInput.nextLine();
    }




    public static void Placement(String[][] board){

        // bekérjük a hajó helyét
        // validáljuk a hajó helyét
        //lerakjuk a hajót


    }


    public static int getValidNumber(char s) {
        boolean numeric = true;
        int num;
        if (s.equals("")) {
            num = 999;
        } else {

            try {
                num = int.parseInt(s);

            } catch (NumberFormatException e) {
                numeric = false;
            }
            if (numeric) {
                return num;
            } else {
                num = rowIndex(s);

            }

        }
        }


        public static int rowIndex(char str); {
            char[] validRowLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
            for (int i = 0; i < validRowLetters.length; i++) {
                if (str.equals(validRowLetters[i])) {
                    break;
                }
            }
            return i;

        }
        public static char checkHit(char board[][],int row, int col) {
            char shoot;
            switch (board[row] [col]) {
                case "0": board[][] = "M";
                case "X": if (board(checkNeighbour(row,col))  == "H") {     // ha NaN, NaN jön vissza, akkor nincs szomszéd,
                    board[row][col] = "S";                                  // ha koordináták jönnek vissza akkor azt is ellenőrizni kell

                }else{board[row][col] = "H"}

                }

                    shoot = M;
                case "M": shoot = M;
                case "S": shoot = M;


            }
        }

        public static int checkNeighbour[][] (char board[][], int row, int col) {
        //


        }

    }

*/