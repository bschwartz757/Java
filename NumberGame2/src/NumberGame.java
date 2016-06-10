import java.util.Random;

/*
* ITC 115 W16 - 3182
* Assignment 3
* 
* Blake Schwartz
* January 23, 2016
*/
//called this NumberGame2 to differentiate from assignment 2
public class NumberGame {
	
	//instance variables
	private int upperLimit;
	private int number;
	private int guess;
	
	//default constructor
	public NumberGame(){
		upperLimit = 50;
		number = 0;
		guess = 0;
	}	
	
	//custom constructor
	public  NumberGame(int upperLimit){
		this.upperLimit = upperLimit;
		//generate random number
		Random random = new Random();
		int randNumber = random.nextInt(upperLimit);		
		this.number = randNumber;
		this.guess = 1;
	}
	
	//get methods for instance variables
	public int getupperLimit(){
		return upperLimit;
	}
	
	public int getNumber(){
		return number;
	}
	
	public int getGuess(){
		return guess;
	}
	
	public void incrementGuessCount(){
		guess++;
	}
	
}
