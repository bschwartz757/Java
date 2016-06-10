package a4.ui;

/*
* ITC 115 W16 - 3182
* Assignment 4
* 
* Blake Schwartz
* February 1, 2016
*/

import java.util.Scanner;

import a4.business.Customer;
import a4.db.CustomerDB;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//welcome message
		System.out.println("Welcome to the Customer Viewer");
		System.out.println();
		
		//create scanner
		Scanner sc = new Scanner(System.in);
		//create ignore case/loop
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
		
			//user prompt
			System.out.print("Enter a customer number: ");
			int customerNumber = Integer.parseInt(sc.nextLine());
			
			//get the customer object
			Customer customer = CustomerDB.getCustomer(customerNumber);
			
			if(customer == null){
				System.out.println("\nThere is no customer number " + customerNumber + " in our records.");
			}else{
			
			//print the formatted address
			String message = customer.getNameAndAddress();
			System.out.println(message);
			}
			
            // see if the user wants to continue
            System.out.print("\nDisplay another customer? (y/n): ");
            choice = sc.nextLine();
            System.out.println();			
		}
		
		sc.close();
	}

}
