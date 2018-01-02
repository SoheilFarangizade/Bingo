package bingogame;

public class Card {

	private int[][] number;
	private boolean[][] marks = new boolean[3][5];

	public Card(int[][] number) {
		this.number = number;
	}

	public int getNumber(int row, int column) {
		return number[row - 1][column - 1];
	}

	public boolean isMarked(int row, int column) {
		return marks[row - 1][column - 1];
	}

	public void markNumber(int number) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				if (this.number[i][j] == number) {
					this.marks[i][j] = true;
				}
			}
		}
	}

}
