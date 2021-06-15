package com.codecool.battleship;

public class ShootingPhase {
    private char[][] map;

    public ShootingPhase(char[][] elements){
        map = elements;
        shotHits(4,4);
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

    public void ShowBoard(int player){
    /*
        if (player == 2){
            player = 1;
            while (player < 4){
            for (int r = 0; r < map[player].length; r++) {
                System.out.println();
                for (int c = 0; c < map[player][r].length; c++) {
                    System.out.print(map[player][r][c] + " ");
                    }
                }
                System.out.println();
                player += 2;
            }
        }

     */

            for (int r = 0; r < map.length; r++) {
                System.out.println();
                for (int c = 0; c < map[r].length; c++) {
                    System.out.print(map[r][c] + " ");
                }
            }
        }



    public void shotHits(int row, int column){

        System.out.println();

        if(map[row][column] == 'X'){
            System.out.println("talált");
        }
        //ShowBoard(2);
        Battleship board = new Battleship();
        board.printMatrix(map);
    }
}
