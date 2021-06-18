package com.codecool.battleship;

public class GameOver {
    char[][] map;

    public GameOver ( char[][] map ) {
        this.map = map;
    }

    public boolean GameWon () {
        boolean endOfGame = true;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == ('X')) {
                    endOfGame = false;
                }
                }
            }

        return endOfGame;
    }
    }



    /*public static void end(){

       /* if(){

        }
    }*/

