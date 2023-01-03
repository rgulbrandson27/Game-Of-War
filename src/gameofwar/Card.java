package gameofwar;

public class Card {
	
	private String value;
	private String suit;
	private int rank;
	
	
	public Card(String value, String suit, int rank) {
		this.value = value;
		this.suit = suit;
		this.rank = rank;
	}
	
	public Card() {
		String value; 
		String suit;
		int rank;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
		
	}
	
	public void describe() {
		System.out.println(getValue() + " of " +  getSuit()); 
	}

	//   without the below toString method, the deck will print in this format:  gameofwar.Card@26f0a63f
	
	public String toString() {
		return value + " of " + suit;
	
	}

}
