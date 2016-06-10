package switch_statement;

import java.util.Scanner;

public class Squares_Cubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Number = 0;
		int square = 0;
		int cube = 0;
		
		Scanner sc = new Scanner(System.in);
		
		String table = "\nNumber\tSquared\tCubed\n";
			table += "======\t======\t======\n";
			
		String choice = "y";
		while(choice.equalsIgnoreCase("y")){	
			
			System.out.println("\nWelcome to the Squares and Cubes table");
			System.out.print("\nEnter an integer: ");
			Number = Integer.parseInt(sc.nextLine());			
			
				for(int i = 1; i <= Number; i++){
					square = (int) Math.pow(i, 2);
					cube = (int) Math.pow(i, 3);
					
					table += i + "\t" +
							square + "\t" +
							cube + "\n";
							
				} 
		
			System.out.println(table);
			System.out.print("Do you want to try again? y/n: ");
			choice = sc.nextLine();	
		}
		sc.close();
		System.out.println("bye");		
	}
}
