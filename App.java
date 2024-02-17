package com.promeniotech;

public class App {

	public static void main(String[] args) {
		
		//a. Instantiate a Deck and two Players, call the shuffle method on the deck.

		//b. Using a traditional for loop, iterate 52 times calling the Draw method on the other player
		//each iteration using the Deck you instantiated.

		//c. Using a traditional for loop, iterate 26 times and call the flip method for each player.
		
		Deck deck = new Deck();		
		deck.shuffle();
		deck.describe();
		System.out.println("---------------------------------");
	//	deck.draw();
	//	deck.describe();
		
		Player playerOne = new Player("Player 1");
		Player playerTwo = new Player("Player 2");
		
		
				
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				playerOne.draw(deck);
			} else {
				playerTwo.draw(deck);
			}	
		}
		
		playerOne.describe();
		System.out.println("---------------------------------");
		playerTwo.describe();
		
		
		
	// Using a traditional for loop, iterate 26 times and call the flip method for each player.
		
	// Compare the value of each card returned by the two player’s flip methods.
	// Call the incrementScore method on the player whose card has the higher value.
	// Print a message to say which player received a point.
	// Note:  If the values are equal (it is a tie), print a message saying that no point was awarded.
	// d. After the loop, compare the final score from each player.

	// e. Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
		
		int roundNumber = 1;
		
		for (int i = 0; i < 26; i++) {
		System.out.println("\n-------- Round " + roundNumber + " of 26 --------");
		roundNumber ++;	
		
		Card playerOneCard = playerOne.flip();
		Card playerTwoCard = playerTwo.flip();
			
		System.out.print(playerOne.getName() + " card: ");
		playerOneCard.describe();
		System.out.print(playerTwo.getName() + " card: ");
		playerTwoCard.describe();
		
		if (playerOneCard.getValue() > playerTwoCard.getValue()) {
			playerOne.incrementScore();
			System.out.println("\n" + playerOne.getName() + " wins round!\n");	
		} else if (playerTwoCard.getValue() > playerOneCard.getValue()) {
			playerTwo.incrementScore();
			System.out.println("\n" + playerTwo.getName() + " wins round!\n");
		} else {
			System.out.println("\nIt's a draw.\n");
		
		}
		System.out.println(playerOne.getName() + "'s score: " + playerOne.getScore() + "\n" + playerTwo.getName() + "'s Score: " + playerTwo.getScore());
		
		}
		
		System.out.println("--------------------------------");
		
		System.out.println("         Final Score\n");
		
		System.out.println(playerOne.getName() + ": " + playerOne.getScore());
		System.out.println(playerTwo.getName() + ": " + playerTwo.getScore());
		
		if (playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("\n" + playerOne.getName() + " is the winner!");
		}  else if (playerTwo.getScore() > playerOne.getScore()) {
			System.out.println("\n" + playerTwo.getName() + " is the winner!");
		} else {
			System.out.println("\nThe match is a draw!");
		}
		
	}
		
	} 


