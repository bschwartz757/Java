package monthlybalance;

import java.text.NumberFormat;

public class CheckingAccount extends Account {
	
	private double monthlyFee;

	public CheckingAccount(double monthlyFee){
		super();
		this.monthlyFee = monthlyFee;
	}
	
	public void subtractMonthlyFee() {
		double balance = super.getBalance();
		double newBalance = balance - monthlyFee;
		super.setBalance(newBalance);
	}
	
	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	
	public double getMonthlyFee() {
		return monthlyFee;
	}
	
	public String getMonthlyFeeFormatted() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(monthlyFee);
	}
}
