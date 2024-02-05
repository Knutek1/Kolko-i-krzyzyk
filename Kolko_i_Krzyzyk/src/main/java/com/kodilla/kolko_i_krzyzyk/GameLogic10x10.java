package com.kodilla.kolko_i_krzyzyk;

public class GameLogic10x10{
    boolean endRound=false;
    public void characterOnField(Player player,int[] playerMove)throws OccupiedFieldException{

        if(GlobalVariables.board10x10[playerMove[0]-1][playerMove[1]*2-1] == ' ')
        GlobalVariables.board10x10[playerMove[0]-1][playerMove[1]*2-1] = player.getCharacter();
        else
            throw new OccupiedFieldException();

    }

    public boolean gameLogic(Player player) {
        int points = 0;
        //check if round ends - horizontal victory
        for(int i=0; i<10; i++){
            for(int j=1; j<13; j=j+2) {
                if (GlobalVariables.board10x10[i][j] == player.getCharacter() &&
                        GlobalVariables.board10x10[i][j + 2] == player.getCharacter() &&
                        GlobalVariables.board10x10[i][j + 4] == player.getCharacter() &&
                        GlobalVariables.board10x10[i][j + 6] == player.getCharacter() &&
                        GlobalVariables.board10x10[i][j + 8] == player.getCharacter()) {
                    points++;
                    player.setPoint(points);
                    endRound = true;
                }
            }
        }
        //check if round ends - vertical victory
        for(int i=0; i<6; i++){
            for(int j=1; j<21; j=j+2) {
                if (GlobalVariables.board10x10[i][j] == player.getCharacter() &&
                        GlobalVariables.board10x10[i+1][j] == player.getCharacter() &&
                        GlobalVariables.board10x10[i+2][j] == player.getCharacter() &&
                        GlobalVariables.board10x10[i+3][j] == player.getCharacter() &&
                        GlobalVariables.board10x10[i+4][j] == player.getCharacter()) {
                    points++;
                    player.setPoint(points);
                    endRound = true;
                }
            }
        }
        //check if round ends - diagonal victory
        for(int i=0; i<6; i++){
            for(int j=1; j<13; j=j+2) {
                if (GlobalVariables.board10x10[i][j] == player.getCharacter() &&
                        GlobalVariables.board10x10[i+1][j+2] == player.getCharacter() &&
                        GlobalVariables.board10x10[i+2][j+4] == player.getCharacter() &&
                        GlobalVariables.board10x10[i+3][j+6] == player.getCharacter() &&
                        GlobalVariables.board10x10[i+4][j+8] == player.getCharacter()) {
                    points++;
                    player.setPoint(points);
                    endRound = true;
                }
            }
        }
        for(int i=0; i<6; i++){
            for(int j=1; j<13; j=j+2) {
                if (GlobalVariables.board10x10[i][j+8] == player.getCharacter() &&
                        GlobalVariables.board10x10[i+1][j+6] == player.getCharacter() &&
                        GlobalVariables.board10x10[i+2][j+4] == player.getCharacter() &&
                        GlobalVariables.board10x10[i+3][j+2] == player.getCharacter() &&
                        GlobalVariables.board10x10[i+4][j] == player.getCharacter()) {
                    points++;
                    player.setPoint(points);
                    endRound = true;
                }
            }
        }


        //check if round ends - full board
        int counter = 0;
        for(int i=0;i<10;i++) {
            for(int j=1;j<21;j=j+2){
                if(GlobalVariables.board10x10[i][j] == ' ')
                    counter++;
            }
        }
        if(counter == 0) {
            player.setPoint(points);
            endRound = true;
        }

        return endRound;
    }
}
