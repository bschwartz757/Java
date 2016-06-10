import java.util.Random;
import java.util.Scanner;

/*
* ITC 115 W16 - 3182
* Assignment 2
* 
* Blake Schwartz
* January 17, 2016
*/
/*
 * Welcome to the Number Guessing Game

Enter the upper limit for the number: 50
OK, I'm thinking of a number between 0 and 50

Enter your guess: 25
Your guess is too high.

Enter your guess: 20
Your guess is too low.

Enter your guess: 23
Correct!

 * Bye!
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
		System.out.println("Enter the upper limit for a number you'd like to guess: ");		
		int upperLimit = Integer.parseInt(sc.next());					
		System.out.println("Ok, I'm thinking of a number between 0 and " + upperLimit + ".");		
		
		//assign and initialize random number
		Random random = new Random();
		int number = random.nextInt(upperLimit - 1) + 1;
		int guess = 0;
		
		while(guess != number){
			
			System.out.println("\nEnter your guess: ");				
			guess = Integer.parseInt(sc.next());			
			
			//if user guess too high	
			if(guess > number){
				System.out.print("Your guess was too high\n");
			//if user guess too low
			}else if(guess < number){
				System.out.print("Your guess was too low\n");			
			}else if(guess == number){ //if user guesses the correct number
				System.out.println("Your guess was correct!");				
				break;
			}

		}
		
		System.out.println("\nGoodbye!");
		//close Scanner
		sc.close();		
	}

}
