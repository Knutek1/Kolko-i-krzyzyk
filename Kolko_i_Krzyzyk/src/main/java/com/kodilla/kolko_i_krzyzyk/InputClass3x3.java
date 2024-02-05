package com.kodilla.kolko_i_krzyzyk;

import java.util.Random;
import java.util.Scanner;

public class InputClass3x3{
    int playerMove;
    boolean flag;

    public int playerInput() {
        do
        {
            try
            {
                do {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Please enter only values from 1 to 9");
                    playerMove = sc1.nextInt();
                }while (playerMove <1 || playerMove >9);
                flag = false;
            }
            catch(Exception e)
            {
                System.out.println("Please enter only integer value");
                flag=true;
            }


        }
        while(flag);

        return playerMove;
    }
    public int computerInput() {

        Random rnd1 = new Random();
        playerMove = rnd1.nextInt(9)+1;

        return playerMove;
    }
}
