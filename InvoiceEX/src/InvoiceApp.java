import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Welcome to the invoice calculator");
			
			//take user input
			Scanner sc = new Scanner(System.in);
			String choice = "y";
			while(!choice.equalsIgnoreCase("n")){
				System.out.print("Enter the subtotal ");
				String subtotalLine = sc.nextLine();
				double subtotal = new BigDecimal(subtotalLine).setScale(2, RoundingMode.HALF_UP).doubleValue();
				
				double discountPercent;
				if(subtotal >= 200){
					discountPercent = .2;
					
				}else if(subtotal >= 100){
					discountPercent = .1;
				}else{
					discountPercent = 0;
				}
				
				//calculate discount amount
				double discountAmount = subtotal * discountPercent;
				discountAmount = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP).doubleValue();
				
				//calculate total before tax
				double totalBeforeTax = subtotal - discountAmount;
				
				//calc sales tax
				final double SALES_TAX_PCT = .05;
				double salesTax = SALES_TAX_PCT * totalBeforeTax;
				
				salesTax = new BigDecimal(salesTax).setScale(2, RoundingMode.HALF_UP).doubleValue();
				
				double total = totalBeforeTax + salesTax;
				
				NumberFormat currency = NumberFormat.getCurrencyInstance();
				NumberFormat percent = NumberFormat.getPercentInstance();
				
				String message = "\nINVOICE " +
					"Subtotal: " + currency.format(subtotal) + "\n"
					+ "Discount Percent: " + percent.format(discountPercent) + "\n"
					+ "Total before tax: " + currency.format(totalBeforeTax) + "\n"
					+ "Discount amount : " + currency.format(discountAmount) + "\n"
					+ "Sales Tax : " + currency.format(salesTax) + "\n"
					+ "Invoice Total : " + currency.format(total) + "\n";

					System.out.println(message);
				
				System.out.print("Continue? y/n ");
				choice = sc.nextLine();
			}
			sc.close();
			System.out.println("bye");
	}
	

}
