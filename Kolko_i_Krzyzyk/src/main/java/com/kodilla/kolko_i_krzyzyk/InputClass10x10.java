package com.kodilla.kolko_i_krzyzyk;

import java.util.Random;
import java.util.Scanner;

public class InputClass10x10{
    int playerMove[]=new int[2];
    boolean flag;
    String[] rawAndColumnArray = {"Please select ROW number", "Please select COLUMN number"};

    public int[] playerInput() {
        for(int i=0; i<2; i++) {
            System.out.println(rawAndColumnArray[i]);
            do {
                try {
                    do {
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("Please enter only values from 1 to 10");
                        playerMove[i] = sc1.nextInt();
                    } while (playerMove[i] < 1 || playerMove[i] > 10);
                    flag = false;
                } catch (Exception e) {
                    System.out.println("Please enter only integer value");
                    flag = true;
                }


            }
            while (flag);
        }
        return playerMove;
    }
    public int[] computerInput() {

        Random rnd1 = new Random();
        for(int i=0; i<2; i++) {
            playerMove[i] = rnd1.nextInt(10) + 1;
        }
        return playerMove;
    }
}
