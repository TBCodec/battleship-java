package com.codecool.battleship;

import java.util.Random;
import java.util.Scanner;

public class Battleship {
    //placement phase method goes here

    public static char InputChar(String message) {
        //message method that asks for an input and then returns it
        return 'a';
    }
// static Player1Phase {
    public static void main(String[] args) {
        int[] RowNames = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        char[] ColoumNames = {'A', 'B', 'C', 'D', 'E'};

        System.out.println("Player 1, its your turn");
        char[][] map = new char[5][5];
        for (int i = 0; i < map.length; i++) {
            System.out.println();
            for (int j = 0; j < map.length; j++) {
                if (i == 3 && j == 3) map[i][j] = 'x';
                System.out.print(map[i][j] + "  ");
            }

        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Set the row, coloumn and  direction");
        String RowInput = input.nextLine();
        String ColoumnInput = input.nextLine();

        String DirectionInput = input.nextLine();

        int ColoumnInputNumber = Integer.parseInt(ColoumnInput);

        //if the choice is not correct, display an error message saying that the choices arent correct
        //If user wants to place two ships next to each other then error message is displayed//


    }


public static void main(String args) {
    Int[] RowNames = return_Array();
    char[] ColumnNames= return_Column();



    System.out.println("Player 2, its your turn");
    char[][][] map = new char[PlayerNumber][5][5];
    for (int 0 = Playernumber; i < map.length ;
    i++){
        System.out.println();
        for (int j = 0; j < map.length; j++) {
            if (i == 3 && j == 3) map[PlayerNumber][i][j] = 'x';
            System.out.print(map[PlayerNumber][i][j] + "  ");
        }
    }
        char PlayerNumber() {
         Playernumber= 0;}


//user enters row, coloumns and direction commands and the game processes those commands
        /*System.out.println("Set the row, coloumn and  direction");
        String RowInput=input.nextLine();
        String ColoumnInput=input.nextLine();
        String DirectionInput=input.nextLine();

        int ColoumnInputNumber=Integer.parseInt(ColoumnInput);


        }
        }
        }



         //String UserInput = Input.nextLine();

        //validate information
        //char reading method
        //for( int map =0; map <;i++);
        //while (map>5 && map <1){
                //System.out.println("Set the row, coloumn and  direction");
                //if the choice is not correct, display an error message saying that the choices arent correct




//Shooting phase



