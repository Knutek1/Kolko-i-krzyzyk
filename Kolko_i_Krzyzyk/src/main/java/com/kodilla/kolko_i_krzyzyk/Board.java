package com.kodilla.kolko_i_krzyzyk;

public class Board {
    public static void information3x3() {
        char board[][] = new char[3][7];

        System.out.println("Below are given the numbers of the fields on the board");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j = j + 2) {
                board[i][j] = '|';
            }
        }
        board[0][1] = '1';
        board[0][3] = '2';
        board[0][5] = '3';
        board[1][1] = '4';
        board[1][3] = '5';
        board[1][5] = '6';
        board[2][1] = '7';
        board[2][3] = '8';
        board[2][5] = '9';


        for (int i = 0; i < 3; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 7; j++) {
                sb.append(board[i][j]);
            }
            System.out.println(sb);
        }

    }

    public static void printActualBoard10x10(){
        for (int i = 0; i < 1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("   ");
            for (int j = 1; j < 21; j=j+2) {
                sb.append((j+1)/2);
                sb.append(" ");
            }
            System.out.println(sb);
        }
        for (int i = 0; i < 10; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i+1);
            if(i<9)
                sb.append(" ");
            for (int j = 0; j < 21; j++) {
                sb.append(GlobalVariables.board10x10[i][j]);
            }
            System.out.println(sb);
        }
    }
    public static void printActualBoard3x3(){
        for (int i = 0; i < 3; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 7; j++) {
                sb.append(GlobalVariables.board3x3[i][j]);
            }
            System.out.println(sb);
        }
    }
}