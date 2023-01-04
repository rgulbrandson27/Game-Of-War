package store;

import java.util.ArrayList;
import java.util.List;

import gameofwar.Card;
import gameofwar.Deck;

public class PlayerTest {

		private String name;
		private List<Card> hand = new ArrayList<Card>();
		final int topCard = 0;
	           			
//-------------------------------
		
		public PlayerTest(String name) {		
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
//---------------------------------
		
		
		public List<Card> getHand() {
			return hand;
		}
		public List<Card> setHand(List<Card> hand) {
			return this.hand = hand;
		}

//---------------------------------		

		
		public void receiveDealtCard(Deck deck)	{		   // used within the deal method in main class
			for (int index = 1; index <= 26; index++) {
				Card card = deck.draw();
			    hand.add(card);
			}
		}
			//Card card = deck.draw();
			//hand.add(card);
//			getHand().add(deck.draw());
//			return card;
//		}
		
		
		
		
//		public Card draw() {	
//			return this.remove(0);
		
//		public receiveDealtCard(deck)	{
//			return hand.add(deck.draw(Card));
//		}
		
//		public void receiveDealtCard(Deck Card) {
//			return this..hand.add.draw());
//		}
		
		
		public Card flipCard() {	      // player "plays" the card
			Card flippedCard = hand.get(topCard);
			hand.remove(topCard);
			return flippedCard;
			//return topCard;
			//return hand.remove(0)
		}
	}	

//getHand().add(deck.draw());
	}
	

//	public receiveDealtCard(deck)	{
//		return hand.add(deck.draw(Card));
//	}
	
//	public void receiveDealtCard(Deck Card) {
//		return this..hand.add.draw());
//	}


	

//	public receiveDealtCard(deck)	{
//		return hand.add(deck.draw(Card));
//	}
	
//	public void receiveDealtCard(Deck Card) {
//		return this..hand.add.draw());
//	}
	
	//Card topCard = hand.get(0);
			//hand.remove(0);
			//return topCard;