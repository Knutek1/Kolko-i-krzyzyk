package com.kodilla.kolko_i_krzyzyk;

public class VisualLayer10x10{
    int player1Points = 0;
    int computerOrPlayer2Points = 0;

    public static void emptyGameBoard() {

        //make a start board
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 21; j = j + 2) {
                GlobalVariables.board10x10[i][j] = '|';
            }
            for (int j = 1; j < 21; j = j + 2) {
                GlobalVariables.board10x10[i][j] = ' ';
            }
        }

        for (int i = 0; i < 10; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 21; j++) {
                sb.append(GlobalVariables.board10x10[i][j]);
            }
        }

    }


    public void game() {

        boolean flag;

        while (GlobalVariables.playerList.get(0).getNumberOfWinningRounds() > player1Points &&
                GlobalVariables.playerList.get(0).getNumberOfWinningRounds() > computerOrPlayer2Points) {

            boolean endOfRound = false;

            while (!endOfRound) {
                //Moves of player1
                System.out.println(GlobalVariables.playerList.get(0).getName() + " Please select the ROW and COLUMN number where you want to place your character");
                do {
                    try {
                        GameLogic10x10 gl = new GameLogic10x10();
                        InputClass10x10 input = new InputClass10x10();
                        gl.characterOnField(GlobalVariables.playerList.get(0),input.playerInput());
                        endOfRound = gl.gameLogic(GlobalVariables.playerList.get(0));
                        flag = false;
                    } catch (OccupiedFieldException e) {
                        System.out.println("This field is arleady occupied");
                        flag = true;
                    }
                } while (flag);

                //Print the actual board
                Board.printActualBoard10x10();

                //counting winning rounds
                if (endOfRound && GlobalVariables.playerList.get(0).getPoint()!=0) {
                    player1Points++;
                    System.out.println("Round for " + GlobalVariables.playerList.get(0).getName());
                }

                // moves of Player2 or Computer
                if(!endOfRound) {

                    //Moves of Computer
                    if (GlobalVariables.playerList.get(1).getName().equals("Computer")) {
                        System.out.println("Computer move");
                        do {
                            try {
                                GameLogic10x10 gl = new GameLogic10x10();
                                InputClass10x10 input = new InputClass10x10();
                                gl.characterOnField(GlobalVariables.playerList.get(1), input.computerInput());
                                endOfRound = gl.gameLogic(GlobalVariables.playerList.get(1));
                                flag = false;
                            } catch (OccupiedFieldException e) {
                                System.out.println("This field is arleady occupied");
                                flag = true;
                            }
                        } while (flag);
                        // print the actual board
                        Board.printActualBoard10x10();

                        //counting winning rounds
                        if (endOfRound) {
                            computerOrPlayer2Points++;
                            System.out.println("Round for " + GlobalVariables.playerList.get(1).getName());
                        }
                    }
                    //Moves of player2
                    else {
                        System.out.println(GlobalVariables.playerList.get(1).getName() + " Please select the field number where you want to place your character");
                        do {
                            try {
                                GameLogic10x10 gl = new GameLogic10x10();
                                InputClass10x10 input = new InputClass10x10();
                                gl.characterOnField(GlobalVariables.playerList.get(1), input.playerInput());
                                endOfRound = gl.gameLogic(GlobalVariables.playerList.get(1));
                                flag = false;
                            } catch (OccupiedFieldException e) {
                                System.out.println("This field is arleady occupied");
                                flag = true;
                            }
                        } while (flag);
                        // print the actual board
                        Board.printActualBoard10x10();

                        //counting winning rounds
                        if (endOfRound) {
                            computerOrPlayer2Points++;
                            System.out.println("Round for " + GlobalVariables.playerList.get(1).getName());
                        }

                    }
                }
            }
            // current result and cleaning the board
            System.out.println(GlobalVariables.playerList.get(0).getName()+ ": " +player1Points+
                    "\n" +GlobalVariables.playerList.get(1).getName()+ ": " +computerOrPlayer2Points);
            emptyGameBoard();
        }
        //summary
        if(player1Points >computerOrPlayer2Points)
            System.out.println(GlobalVariables.playerList.get(0).getName() + " wins the game");
        else
            System.out.println(GlobalVariables.playerList.get(1).getName() +" wins the game");
    }
}
