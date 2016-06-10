package ui;

import card.Card;
import card.Suit;

public class CardSuitApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the Card Suit Tester \n");
		
		//instantiate card object
		Card card = new Card();
		
		card.setSuit(Suit.SPADES);
		card.setNumber(1);
		
		displayCard(card);
	}
	
	//display card method
	public static void displayCard(Card card){
		if(card.getNumber() == 1){
			System.out.print("Ace");
		}else if(card.getNumber() == 11){
			System.out.print("Jack");
		}else if(card.getNumber() == 12){
			System.out.print("Queen");
		}else if(card.getNumber() == 13){
			System.out.print("King");
		}else if(card.getNumber() > 13){
			System.out.println("???");
		}else{
			System.out.print(card.getNumber());
		}
		
		System.out.print(" of ");
		
		if(card.getSuit() == Suit.SPADES){
			System.out.print("Spades");
		}else if(card.getSuit() == Suit.HEARTS){
			System.out.print("Hearts");
		}else if (card.getSuit() == Suit.DIAMONDS){
			System.out.print("Diamonds");
		}else if(card.getSuit() == Suit.CLUBS){
			System.out.print("Clubs");
		}
		
		System.out.print("!");
		
	}

}
