
import java.util.Scanner;

/*
* ITC 115 W16 - 3182
* Assignment 3
* 
* Blake Schwartz
* January 23, 2016
 */

public class NumberGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create Scanner to read user input
		Scanner sc = new Scanner(System.in);
		
		//WELCOME message
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println();	
		
		//get the upperLimit from the user
		System.out.println("Enter the upper limit: ");		
		int upperLimit = Integer.parseInt(sc.next());
		
		NumberGame game = new NumberGame(upperLimit);
		System.out.println("Please enter a number");		
		
		System.out.println("Ok, I'm thinking of a number between 0 and " + upperLimit + ".");		
		int userGuess = 0;
		
		while(userGuess != game.getNumber()){
			
			System.out.println("\nEnter your guess: ");				
			userGuess = Integer.parseInt(sc.next());			
			
			//if user guess too high	
			if(userGuess > game.getNumber()){
				System.out.print("Your guess was too high\n");
				game.incrementGuessCount();
			//if user guess too low
			}else if(userGuess < game.getNumber()){
				System.out.print("Your guess was too low\n");
				game.incrementGuessCount();
			}else if(userGuess == game.getNumber()){ //if user guesses the correct number
				System.out.println("Your guess was correct!");				
				break;
			}

		}
		
		System.out.println("The number of guesses: " + game.getGuess());
		System.out.println("Your upper limit was: " + game.getupperLimit());
		
		System.out.println("\nGoodbye!");
		//close Scanner
		sc.close();		
	}

}
