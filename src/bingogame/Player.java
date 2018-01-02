package bingogame;

public class Player {

	private String name;
	private Card[] cards;

	public Player(String name, Card[] cards) {
		this.name = name;
		this.cards = cards;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Card[] getCard() {
		return cards;
	}

	public void setCard(Card[] card) {
		this.cards = card;
	}

	public boolean isWinner() {
		boolean flag = true;
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 5; k++) {
					flag = flag && cards[i].isMarked(j + 1, k + 1);
				}
				if (flag == true) {
					return true;
				}
			}
		}
		return false;
	}

	public void markNumber(int number) {
		for (int i = 0; i < cards.length; i++) {
			cards[i].markNumber(number);
		}
	}

}
