package com.kodilla.kolko_i_krzyzyk;


public class KolkoIKrzyzykApplication{

	//private Image imageback = new Image("file:src/main/resources/coverPhoto.jpg");

	public static void main(String[] args) {
		//launch(args);

		WelcomeClass welcomeClass = new WelcomeClass();
		char typeOfBoard = welcomeClass.welcome();
		if(typeOfBoard == '1') {
			Board.information3x3();
			VisualLayer3x3 visualLayer = new VisualLayer3x3();
			VisualLayer3x3.emptyGameBoard();
			visualLayer.game();
		}else{
			VisualLayer10x10 visualLayer = new VisualLayer10x10();
			VisualLayer10x10.emptyGameBoard();
			visualLayer.game();
		}

	}

	/*@Override
	public void start(Stage primaryStage) throws Exception {
		BackgroundSize backgroundSize = new BackgroundSize(0, 0, false, false, true, false);
		BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
		Background background = new Background(backgroundImage);

		GridPane grid = new GridPane();
		grid.setBackground(background);

		Scene scene = new Scene(grid, 1000, 800, Color.BLACK);

		primaryStage.setTitle("Kolko i krzyzyk");
		primaryStage.setScene(scene);
		primaryStage.show();
	}*/
}
