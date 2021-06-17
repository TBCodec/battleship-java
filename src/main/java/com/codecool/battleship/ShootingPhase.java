package com.codecool.battleship;

public class ShootingPhase {
    private static char[][] map;
    private static char[][] shotMap;

    public ShootingPhase(char[][] map, char[][] shotMap) {
        this.map = map;
        this.shotMap = shotMap;
        //shotHits(4,4);
    }

    public static void main(String[] args) {
        char[][] map = new char[][]{
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', 'X'}
        };

        ShootingPhase shootingPhase = new ShootingPhase(map, map);

    }

    public void shotHits(int row, int column) {
        row -= 1;
        column -= 1;
        System.out.println();

        if (map[row][column] == 'X') {

            if (isThereHCharacter(row, column)) {
                shotMap[row][column] = 'H';
            } else {
                shotMap[row][column] = 'S';
            }
            System.out.println("Talált");

            //shotMap[row][column] = 'H';
        }
        //ShowBoard(2);
        else {
            System.out.println("Nem talált");
            shotMap[row][column] = 'M';
        }

        Battleship board = new Battleship();
        board.printMatrix(shotMap);

    }


    public static boolean isThereHCharacter(int x, int y) {
        boolean iTHC = true;
        boolean onTheRight;
        boolean onTheLeft;
        boolean onTheBottom;
        boolean onTheTop;

        try {
            onTheRight = shotMap[x + 1][y] == 'H';


        } catch (Exception e) {
            onTheRight = false;
        }
        try {
            onTheLeft = shotMap[x - 1][y] == 'H';

        } catch (Exception e) {
            onTheLeft = false;
        }
        try {
            onTheTop = shotMap[x][y - 1] == 'H';

        } catch (Exception e) {
            onTheTop = false;
        }
        try {
            onTheBottom = shotMap[x][y + 1] == 'H';

        } catch (Exception e) {
            onTheBottom = false;
        }
        if (shotMap[x][y] == 'H') {
            if (!onTheLeft &&
                    !onTheRight &&
                    !onTheTop &&
                    !onTheBottom) {
                iTHC = false;
            } else {
                iTHC = true;
                System.out.println("You've already shot here!");
            }
        }
        else iTHC = false;
        return iTHC;
    }
}