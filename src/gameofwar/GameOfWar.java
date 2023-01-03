package gameofwar;

public class GameOfWar {

	static Player player1 = new Player("Player 1");
	static Player player10 = new Player("Player 10");

	public static void main(String[] args) {
	
	Deck deck = new Deck();
		//System.out.println(deck);	
		deck.shuffle();
		//System.out.println(deck);
	
	new GameOfWar().run(); 
	}
		private void run() {
			
			Deck deck = new Deck();
		
			announceGame();
		
			shuffleAndDealCards();					    

			playGame();
			
			declareWinner();
		}	
	
		
//----------ANNOUNCE GAME
		
	public static void announceGame() {
		System.out.println("WELCOME SPECTATORS, WE HAVE A FANTASTIC SHOW FOR YOU TODAY!");
		System.out.println("Let me introduce to you our two contestants: Player1 and Player10");
		System.out.println("NOW, for the moment you've been waiting for.....");
		System.out.println("");

		System.out.println("\u2660\uFE0F" + "  " + "\u2665\uFE0F" + "  " + "\u2666\uFE0F" + "  " + "\u2663\uFE0F" + "  LET'S PLAY WAR!  " + "\u2660\uFE0F" + "  " + "\u2665\uFE0F" + "  " + "\u2666\uFE0F" + "  " + "\u2663\uFE0F");
		System.out.println("");
	}
		
		
//----------DEAL CARDS
	
	public void shuffleAndDealCards() {
		Deck deck = new Deck();
		deck.shuffle();
		
//		for(int i = 1; i <= 26; i++) {
//			player1.getHand().add(deck.draw());
		//	player10.getHand().add(deck.draw());

		for (int index = 0; index <= deck.size(); index++) {
			if (index %2 == 0) {
			player1.receiveDealtCard(deck);
		System.out.println(player1.getHand());			//temporary - testing only
			}	else 	{
			player10.receiveDealtCard(deck);
		System.out.println(player10.getHand());			//temporary - testing only	
			}
		}
	
	}
//----------PLAY GAME

	private static void playGame() {
	System.out.println("");
	System.out.println("^^^^^^^^^^^^^^^^^^LET'S GO!^^^^^^^^^^^^^^^^^^^");
	System.out.println("______________________________________________");
	System.out.println("");


	Card player1Card = player1.flipCard();
	Card player10Card = player10.flipCard();
	String player1Arrow =  "             1<<<-----------------";
	String player10Arrow = "             ----------------->>>1";
	String tieArrow = 	   "       0-----------------------0 ";
	for (int i = 1; i <= 26; i++) {
		player1.flipCard();
		player10.flipCard();
		System.out.println("                    ROUND " + i + "  ");
		System.out.println("     Player 1                   Player 10         ");
		
		System.out.println(" " + player1Card + "    vs.    " + player10Card);
	
	
		if(player1Card.getRank() > player10Card.getRank()) {
			player1.incrementScore();
			System.out.println(player1Arrow);
			}	else if (player1Card.getRank() < player10Card.getRank()) {
			player10.incrementScore();
			System.out.println(player10Arrow);
			}	else {
			System.out.println("    " + tieArrow);
			}
		System.out.println("                                         ");
	}	
	System.out.println("FINAL SCORE:");
	System.out.println("Player 1: " + player1.getScore() + "     Player 10: " + player10.getScore());
		
	}
		
//----------DECLAREWINNER
	
	private void declareWinner() {
		
		if (player1.getScore() > player10.getScore()) { 
			System.out.println("CONGRATULATIONS PLAYER 1 - YOU ARE THE WINNER OF THIS WAR!");    
			}	else if (player1.getScore() < player10.getScore()) {
			System.out.println("CONGRATULATIONS PLAYER 10 - YOU ARE THE WINNER OF THIS WAR!");
			}	else	{
			System.out.println("DRAW - LET'S SETTLE THIS IN A TIEBREAKER!");
			}
		}
	}
	