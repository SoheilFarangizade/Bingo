package bingogame;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[][] number1 = { { 10, 30, 45, 66, 82 }, { 3, 25, 11, 63, 78 }, { 22, 4, 13, 46, 90 } };
		Card[] cards1 = new Card[1];
		cards1[0] = new Card(number1);

		int[][] number2 = { { 19, 53, 61, 32, 6 }, { 11, 44, 56, 73, 81 }, { 78, 31, 69, 9, 23 } };
		Card[] cards2 = new Card[1];
		cards2[0] = new Card(number2);
		Player[] players = new Player[2];
		players[0] = new Player("Player1", cards1);
		players[1] = new Player("Player2", cards2);

		Bingo bingo = new Bingo(players);

		Random random = new Random();
		String winner = "";

		while (winner.equals("")) {
			int number = random.nextInt(90) + 1;
			winner = bingo.play(number);
		}

		System.out.println(winner);
	}
}
