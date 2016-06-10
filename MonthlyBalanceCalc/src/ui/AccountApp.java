/*
 * Blake Schwartz, ITC 115 - Evening Section
 * Assignment 8
 * Monthly Balance Calculator
 */

package ui;

import monthlybalance.CheckingAccount;
import monthlybalance.Depositable;
import monthlybalance.Transactions;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console.displayLine("Welcome to the Account Calculator");

		Console.displayLine("Enter the transactions for the month");

		CheckingAccount checking = new CheckingAccount(1.0);
		checking.setBalance(1000);
		
		Console.displayLine();
		Console.displayLine("Starting Balance" + "\n" + "Checking: $1,000.00");
		Console.displayLine();	
		Console.displayLine("Enter the transactions for the month");
		Console.displayLine();		
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")){
			String transactionType = Console.getChoice("Withdrawal or deposit? (w/d): ", "w", "d");
			//withdrawal
			if(transactionType.equalsIgnoreCase("w")){
				double amount = Console.getDouble("Amount: ", 0, checking.getBalance());
				Console.displayLine();
				Transactions.withdraw(checking, amount);
			//deposit	
			}else{
				double amount = Console.getDouble("Amount: ", 0, 10000.0);
				Console.displayLine();
				Transactions.deposit(checking, amount);
			}
			choice = Console.getChoice("Continue? (y/n): ", "y", "n");
			Console.displayLine();
		}
		//month-ending calculations
		checking.subtractMonthlyFee();
		
		Console.displayLine("Monthly Fees");
		Console.displayLine("Checking fee:		" + 
		checking.getMonthlyFeeFormatted());
		Console.displayLine();
		
		//display final balances
		Console.displayLine("Final balance");
		Console.displayLine("Checking: " + checking.getBalanceFormatted());
		Console.displayLine();
	}

}
