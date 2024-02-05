package com.kodilla.kolko_i_krzyzyk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WelcomeClass {
    public  char welcome(){
        char mode;
        char typeOfBoard;
        boolean flag;
        List<String> nameList = new ArrayList<>();
        int numberOfVictoryRound =0;

            //mode of the game
        System.out.println("Welcome in the game!!\nChoose the mode of the game:\n" +
                        "Press '1' to play 'Player vs Computer'\n" +
                        "Press '2' to play 'Player vs Player'");
        do {
            Scanner sc1 = new Scanner(System.in);
            mode = sc1.next().charAt(0);
            if (mode != '1' && mode != '2')
                System.out.println("Please enter only '1' or '2'");
        } while (mode != '1' && mode != '2');

        //name of players
        int n = Character.getNumericValue(mode);
        for (int i=0;i<n;i++){
            System.out.println("Player " +(i+1)+ ", please enter your name");
            Scanner sc1 = new Scanner(System.in);
            String name = sc1.next();
            nameList.add(name);
        }
        for(String o : nameList){
            System.out.println("Welcome "+o+"!!!");
        }
        //choosing type of board
        System.out.println("Please choose the type of the board:\nBoard 3x3 press '1'\nBoard 10x10 press '2'");
        do {
            Scanner sc1 = new Scanner(System.in);
            typeOfBoard = sc1.next().charAt(0);
            if (typeOfBoard != '1' && typeOfBoard != '2')
                System.out.println("Please enter only '1' or '2'");
        } while (typeOfBoard != '1' && typeOfBoard != '2');

        //how many rounds to win
        System.out.println("Please enter HOW MANY ROUNDS to WIN: ");
        do
        {
            try
            {
                do {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Enter only values from 1 to 10");
                    numberOfVictoryRound = sc1.nextInt();
                }while (numberOfVictoryRound <1 || numberOfVictoryRound >10);
                flag = false;
            }
            catch(Exception e)
            {
                System.out.println("Please enter only integer value");
                flag=true;
            }


        }
        while(flag);

            //choosing the character
        System.out.println(nameList.get(0)+ ", choose your character 'x' or 'o'");
        do {
            Scanner sc1 = new Scanner(System.in);
            mode = sc1.next().charAt(0);
            if (mode != 'x' && mode != 'o')
                System.out.println("Please enter only 'x' or 'o'");
        } while (mode != 'x' && mode != 'o');
        GlobalVariables.playerList.add(new Player(nameList.get(0),Character.toUpperCase(mode),numberOfVictoryRound,0));
        if(nameList.size()>1){
            switch (mode) {
                case 'x':
                GlobalVariables.playerList.add(new Player(nameList.get(1),'O',numberOfVictoryRound,0));
                break;
                case 'o':
                GlobalVariables.playerList.add(new Player(nameList.get(1),'X',numberOfVictoryRound,0));
            }
        }else {
            switch (mode) {
                case 'x':
                    GlobalVariables.playerList.add(new Player("Computer",'O',numberOfVictoryRound,0));
                    break;
                case 'o':
                    GlobalVariables.playerList.add(new Player("Computer",'X',numberOfVictoryRound,0));
            }
        }
        for(Player o : GlobalVariables.playerList) {
            System.out.println(o.getName() + " plays '" +o.getCharacter()+"'");
        }

        return typeOfBoard;
    }

}
