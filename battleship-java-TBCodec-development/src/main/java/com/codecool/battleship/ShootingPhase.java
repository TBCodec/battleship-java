package com.codecool.battleship;

public class ShootingPhase {
    private static char[][] map;
    private static char[][] shotMap;

    public ShootingPhase(char[][] map, char[][] shotMap) {
        this.map = map;
        this.shotMap = shotMap;
    }

    public void shotHits(int row, int column) {
        PlacementPhase pp = new PlacementPhase();
        char direction = pp.directionOfShip(map, row, column);
        row -= 1;
        column -= 1;
        System.out.println();

        if (map[row][column] == 'X') {
            if (direction == '0'){
                shotMap[row][column] = 'S';
                System.out.println("You've sunk a ship!");
            }

            else shotMap[row][column] = 'H';

            System.out.println("You've hit a ship!");
            map[row][column] = '0';
        }

        else {
            System.out.println("You've missed!");
            shotMap[row][column] = 'M';
        }
    }

}