package gameofwar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("serial")						//class does not need to be serialized
public class Deck extends ArrayList<Card> {

	List<Card> cards = new ArrayList<Card>();
	
	private final List<String> suits = List.of("Spades \u2660\uFE0F", "Hearts \u2665\uFE0F", "Diamonds \u2666\uFE0F", "Clubs \u2663\uFE0F ");
		
	private final List<String> values = List.of("Two", "Three", "Four", "Five", "Six", "Seven", 
		"Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace");

	public Deck() {
		for (int valuePos = 0; valuePos < values.size(); valuePos += 1) {
			int rank = valuePos + 2;
			String value = values.get(valuePos);
			
			for (String suit : suits) {
				add(new Card(value, suit, rank));
			}
		}
	}		
	
//----------SHUFFLE METHOD
	
	public void shuffle() {
		Collections.shuffle(this);
	}
	
//----------DRAW METHOD

	public Card draw() {	
		return this.remove(0);
	}
}	
	
	


