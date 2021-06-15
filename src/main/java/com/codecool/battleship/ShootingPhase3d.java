package com.codecool.battleship;

public class ShootingPhase3d {
    private char[][][] map;

    public ShootingPhase3d(char[][][] elements){
        map = elements;
        shotHits(0,4,4);
    }

    public static void main(String[] args) {
        char[][][] map = new char[][][] {
                {
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', 'X'}
                },
                {
                        {'0', '0', '0', '0', 'M'},
                        {'S', 'S', 'M', '0', '0'},
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'}
                },
                {
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', 'X'}
                },
                {
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'},
                        {'H', 'M', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'},
                        {'0', '0', 'S', '0', '0'}
                },
        };

        ShootingPhase3d shootingPhase = new ShootingPhase3d(map);

    }

    public void ShowBoard(int player){
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
        else {
            for (int r = 0; r < map[player].length; r++) {
                System.out.println();
                for (int c = 0; c < map[player][r].length; c++) {
                    System.out.print(map[player][r][c] + " ");
                }
            }
        }

    }

    public void shotHits(int player, int row, int column){

        System.out.println();

        if(map[player][row][column] == 'X'){
            System.out.println("talált");
        }
        ShowBoard(2);
    }
}
