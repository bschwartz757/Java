package ch03.practice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create new Scanner object
		Scanner sc = new Scanner(System.in);
		
		//get a String object for a product code
		System.out.print("Enter product code: ");
		String productCode = sc.nextLine();
		
		//get a String object for a quantity
		System.out.print("Enter quantity: ");
		String quantityLine = sc.nextLine();
		
		//get a String object for a price
		System.out.print("Enter price: ");
		String priceLine = sc.nextLine();
		
		//close the Scanner
		sc.close();
	}

}
