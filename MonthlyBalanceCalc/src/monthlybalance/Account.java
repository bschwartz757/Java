package monthlybalance;

import java.text.NumberFormat;

public class Account implements Depositable, Withdrawable, Balanceable {

	private double balance;
	
	public Account(){
		balance = 0;
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		// TODO Auto-generated method stub
		balance = amount;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance -= amount;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance += amount;
	}
	
	public String getBalanceFormatted(){
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(balance);
	}
}
