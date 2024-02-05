package com.kodilla.kolko_i_krzyzyk;


import org.junit.jupiter.api.*;

@DisplayName("Testy programu kółko i krzyżyk")
class KolkoIKrzyzykApplicationTests {

	@BeforeEach
	public void emptyBoard(){
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 7; j = j + 2) {
				GlobalVariables.board3x3[i][j] = '|';
			}
			for (int j = 1; j < 7; j = j + 2) {
				GlobalVariables.board3x3[i][j] = ' ';
			}
		}
	}
	@Nested
	@DisplayName("Wygrywające O")
	class oWinner{
		@Nested
		@DisplayName("Wygrywające O w wierszach")
		class oWinnerInRow {
			@Test
			void oWinnerInFirstRow() {
				//Given
				for (int j = 1; j < 7; j = j + 2) {
					GlobalVariables.board3x3[0][j] = 'O';
				}
				Player player = new Player("Tamagodzi", 'O', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}

			@Test
			void oWinnerInSecondRow() {
				//Given
				for (int j = 1; j < 7; j = j + 2) {
					GlobalVariables.board3x3[1][j] = 'O';
				}
				Player player = new Player("Tamagodzi", 'O', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}

			@Test
			void oWinnerInThirdRow() {
				//Given
				for (int j = 1; j < 7; j = j + 2) {
					GlobalVariables.board3x3[2][j] = 'O';
				}
				Player player = new Player("Tamagodzi", 'O', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}
		}
		@Nested
		@DisplayName("Wygrywające O w kolumnach")
		class oWinnerInColumn {
			@Test
			void oWinnerInFirstColumn() {
				//Given
				for (int i = 0; i < 3; i++) {
					GlobalVariables.board3x3[i][1] = 'O';
				}
				Player player = new Player("Tamagodzi", 'O', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}
			@Test
			void oWinnerInSecondColumn() {
				//Given
				for (int i = 0; i < 3; i++) {
					GlobalVariables.board3x3[i][3] = 'O';
				}
				Player player = new Player("Tamagodzi", 'O', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}
			@Test
			void oWinnerInThirdColumn() {
				//Given
				for (int i = 0; i < 3; i++) {
					GlobalVariables.board3x3[i][5] = 'O';
				}
				Player player = new Player("Tamagodzi", 'O', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}

		}
		@Nested
		@DisplayName("Wygrywające O po przekątnej")
		class oWinnerInDiagonal {
			@Test
			void oWinnerInFirstDiagonal() {
				//Given
				GlobalVariables.board3x3[0][1] = 'O';
				GlobalVariables.board3x3[1][3] = 'O';
				GlobalVariables.board3x3[2][5] = 'O';
				Player player = new Player("Tamagodzi", 'O', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}
			@Test
			void oWinnerInSecondDiagonal() {
				//Given
				GlobalVariables.board3x3[0][5] = 'O';
				GlobalVariables.board3x3[1][3] = 'O';
				GlobalVariables.board3x3[2][1] = 'O';
				Player player = new Player("Tamagodzi", 'O', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}
		}
	}
	@Nested
	@DisplayName("Wygrywające X")
	class xWinner{
		@Nested
		@DisplayName("Wygrywające X w wierszach")
		class xWinnerInRow {
			@Test
			void xWinnerInFirstRow() {
				//Given
				for (int j = 1; j < 7; j = j + 2) {
					GlobalVariables.board3x3[0][j] = 'X';
				}
				Player player = new Player("Tamagodzi", 'X', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}

			@Test
			void xWinnerInSecondRow() {
				//Given
				for (int j = 1; j < 7; j = j + 2) {
					GlobalVariables.board3x3[1][j] = 'X';
				}
				Player player = new Player("Tamagodzi", 'X', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}

			@Test
			void xWinnerInThirdRow() {
				//Given
				for (int j = 1; j < 7; j = j + 2) {
					GlobalVariables.board3x3[2][j] = 'X';
				}
				Player player = new Player("Tamagodzi", 'X', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}
		}
		@Nested
		@DisplayName("Wygrywające X w kolumnach")
		class oWinnerInColumn {
			@Test
			void xWinnerInFirstColumn() {
				//Given
				for (int i = 0; i < 3; i++) {
					GlobalVariables.board3x3[i][1] = 'X';
				}
				Player player = new Player("Tamagodzi", 'X', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}
			@Test
			void xWinnerInSecondColumn() {
				//Given
				for (int i = 0; i < 3; i++) {
					GlobalVariables.board3x3[i][3] = 'X';
				}
				Player player = new Player("Tamagodzi", 'X', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}
			@Test
			void xWinnerInThirdColumn() {
				//Given
				for (int i = 0; i < 3; i++) {
					GlobalVariables.board3x3[i][5] = 'X';
				}
				Player player = new Player("Tamagodzi", 'X', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}

		}
		@Nested
		@DisplayName("Wygrywające X po przekątnej")
		class oWinnerInDiagonal {
			@Test
			void xWinnerInFirstDiagonal() {
				//Given
				GlobalVariables.board3x3[0][1] = 'X';
				GlobalVariables.board3x3[1][3] = 'X';
				GlobalVariables.board3x3[2][5] = 'X';
				Player player = new Player("Tamagodzi", 'X', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}
			@Test
			void xWinnerInSecondDiagonal() {
				//Given
				GlobalVariables.board3x3[0][5] = 'X';
				GlobalVariables.board3x3[1][3] = 'X';
				GlobalVariables.board3x3[2][1] = 'X';
				Player player = new Player("Tamagodzi", 'X', 1,0);
				//When
				GameLogic3x3 gl = new GameLogic3x3();
				boolean endRound = gl.gameLogic(player);
				//  Then
                Assertions.assertTrue(endRound);
				Assertions.assertEquals(1,player.getPoint());

			}
		}
	}
	@Test
	public void draw(){
		//Given
	GlobalVariables.board3x3[0][1] = 'O';
		GlobalVariables.board3x3[0][3] = 'X';
		GlobalVariables.board3x3[0][5] = 'O';
		GlobalVariables.board3x3[1][1] = 'O';
		GlobalVariables.board3x3[1][3] = 'X';
		GlobalVariables.board3x3[1][5] = 'X';
		GlobalVariables.board3x3[2][1] = 'X';
		GlobalVariables.board3x3[2][3] = 'O';
		GlobalVariables.board3x3[2][5] = 'X';
		Player player = new Player("Tamagodzi", 'X', 1,0);
		//When
		GameLogic3x3 gl = new GameLogic3x3();
		boolean endRound = gl.gameLogic(player);
		//  Then
        Assertions.assertTrue(endRound);
		Assertions.assertEquals(0,player.getPoint());

	}

	@Test
	public void vorbiddenMove1() {
		//Given
		GlobalVariables.board3x3[0][1] = 'O';
		Player player = new Player("Tamagodzi", 'X', 1,0);
		GameLogic3x3 gl = new GameLogic3x3();
		//When & Then
		Assertions.assertThrows(OccupiedFieldException.class,()->gl.characterOnField(player,1));
	}
	@Test public void vorbiddenMove2() {
		//Given
		GlobalVariables.board3x3[1][5] = 'X';
		Player player = new Player("Tamagodzi", 'X', 1,0);
		GameLogic3x3 gl = new GameLogic3x3();
		//When & Then
		Assertions.assertThrows(OccupiedFieldException.class,()->gl.characterOnField(player,6));
	}

}
