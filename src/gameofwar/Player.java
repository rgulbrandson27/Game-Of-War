package gameofwar;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private List<Card> hand = new ArrayList<Card>();
	private int score;		           					//auto defaults to 0
	
	public Player(String name) {		
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}	
	public void setScore(int score) {		
		this.score = score;
	}

	public void describe() {				
		System.out.println(getName() + " Score:  " + score);												
	}
	
	public void receiveDealtCard(Deck deck)	{		   // used within the deal method in main class
		Card card = deck.draw();
		hand.add(card);
		//getHand().add(deck.draw());
	}

	public Card flipCard() {	      // player "plays" the card
		return hand.remove(0);
	}
	
	public void incrementScore() {		
		score = getScore() + 1;
	}
	
}	
