package com.kodilla.kolko_i_krzyzyk;

public class GameLogic3x3{
    boolean endRound=false;
    public void characterOnField(Player player,int playerMove)throws OccupiedFieldException{

        switch (playerMove){
            case 1:
                if (GlobalVariables.board3x3[0][1] == ' ')
                    GlobalVariables.board3x3[0][1] = player.getCharacter();
                else
                    throw new OccupiedFieldException();
                break;
            case 2:
                if (GlobalVariables.board3x3[0][3] == ' ')
                    GlobalVariables.board3x3[0][3] = player.getCharacter();
                else
                    throw new OccupiedFieldException();
                break;
            case 3:
                if (GlobalVariables.board3x3[0][5] == ' ')
                    GlobalVariables.board3x3[0][5] = player.getCharacter();
                else
                    throw new OccupiedFieldException();
                break;
            case 4:
                if (GlobalVariables.board3x3[1][1] == ' ')
                    GlobalVariables.board3x3[1][1] = player.getCharacter();
                else
                    throw new OccupiedFieldException();
                break;
            case 5:
                if (GlobalVariables.board3x3[1][3] == ' ')
                    GlobalVariables.board3x3[1][3] = player.getCharacter();
                else
                    throw new OccupiedFieldException();
                break;
            case 6:
                if (GlobalVariables.board3x3[1][5] == ' ')
                    GlobalVariables.board3x3[1][5] = player.getCharacter();
                else
                    throw new OccupiedFieldException();
                break;
            case 7:
                if (GlobalVariables.board3x3[2][1] == ' ')
                    GlobalVariables.board3x3[2][1] = player.getCharacter();
                else
                    throw new OccupiedFieldException();
                break;
            case 8:
                if (GlobalVariables.board3x3[2][3] == ' ')
                    GlobalVariables.board3x3[2][3] = player.getCharacter();
                else
                    throw new OccupiedFieldException();
                break;
            case 9:
                if (GlobalVariables.board3x3[2][5] == ' ')
                    GlobalVariables.board3x3[2][5] = player.getCharacter();
                else
                    throw new OccupiedFieldException();
                break;

        }
    }

    public boolean gameLogic(Player player) {
        int points = 0;
        //check if round ends - horizontal victory
        for (int i=0; i<3;i++) {
            if (GlobalVariables.board3x3[i][1] == player.getCharacter() &&
                    GlobalVariables.board3x3[i][3] == player.getCharacter() &&
                    GlobalVariables.board3x3[i][5] == player.getCharacter()) {
                points++;
                player.setPoint(points);
                endRound = true;
            }
        }
        //check if round ends - vertical victory
        for(int j=1; j<7; j=j+2) {
            if (GlobalVariables.board3x3[0][j] == player.getCharacter() &&
                    GlobalVariables.board3x3[1][j] == player.getCharacter() &&
                    GlobalVariables.board3x3[2][j] == player.getCharacter()){
                points++;
            player.setPoint(points);
            endRound = true;
        }
        }
        //check if round ends - diagonal victory
        if (GlobalVariables.board3x3[0][1] == player.getCharacter() &&
            GlobalVariables.board3x3[1][3] == player.getCharacter() &&
            GlobalVariables.board3x3[2][5] == player.getCharacter()){
            points++;
        player.setPoint(points);
        endRound = true;
    }

        if (GlobalVariables.board3x3[0][5] == player.getCharacter() &&
                GlobalVariables.board3x3[1][3] == player.getCharacter() &&
                GlobalVariables.board3x3[2][1] == player.getCharacter()){
            points++;
        player.setPoint(points);
        endRound = true;
    }

        //check if round ends - full board
        int counter = 0;
        for(int i=0;i<3;i++) {
            for(int j=1;j<7;j=j+2){
                if(GlobalVariables.board3x3[i][j] == ' ')
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

