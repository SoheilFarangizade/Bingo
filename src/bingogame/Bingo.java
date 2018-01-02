package bingogame;

public class Bingo {

	private Player[] players;

	public Bingo(Player[] player) {
		this.players = player;
	}

	public String play(int number) {
		for (int i = 0; i < players.length; i++) {
			players[i].markNumber(number);
		}
		String winners = "";
		for (int i = 0; i < players.length; i++) {
			if (players[i].isWinner())
				winners += players[i].getName() + " ";
		}
		return winners;
	}

}
