package maker.change;

import java.util.Scanner;

/*
* ITC 115 W16 - 3182
* Assignment 5
* 
* Blake Schwartz
* February 8, 2016
*/

public class ChangeMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instance variables
		int Input = 0; //user input
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		String Output = "";
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")){
		
			//user prompts
			System.out.println("Welcome to the Change Calculator");		
			System.out.print("\nEnter number of cents (0-99): ");
			Input = Integer.parseInt(sc.nextLine());	
			
			if(Input >= 0 && Input <= 99){
				//process input and sort into quarters, dimes, etc
				quarters = Input/25;
				Input = Input % 25;
				
				dimes = Input/10;
				Input = Input % 10;
				
				nickels = Input/5;
				Input = Input % 5;
				
				pennies = Input/1;
				Input = Input % 1;
				
				Output = "Quarters: " + quarters + "\n"
						+ "Dimes: " + dimes + "\n"
						+ "Nickels: " + nickels + "\n"
						+ "Pennies: " + pennies + "\n";	
			}
			
			System.out.println("\n" + Output);
			System.out.print("Continue? (y/n):");
			choice = sc.nextLine();				
		}
		
		sc.close();	
	}

}
