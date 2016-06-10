import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(true){
			//get user input
			System.out.print("Enter customer type (r/c/t)");
			String customerType = sc.nextLine();
			System.out.print("\nEnter subtotal (number): ");
			
			double subtotal;
			try{
				subtotal = Double.parseDouble(sc.nextLine());
				
			}catch(NumberFormatException e){
				System.out.println("Invalid Number. Try again.");
				continue;
			}
			
			//determine discount %
			double discountPercent;
			switch(customerType){
			case "r":
				if(subtotal < 100)
					discountPercent = 0.0;
				else if(subtotal >= 100 && subtotal < 250)
					discountPercent = .1;
				else if(subtotal >= 250 && subtotal < 500)
					discountPercent = .25;
				else discountPercent = .3;
				break;
			case "t":
				discountPercent = .4;
				break;
			case "c":
				discountPercent = .2;
				break;
				default:
					discountPercent = 0.0;
					break;
			}
			
			//calculate discount amount and total
			double discountAmount = subtotal * discountPercent;
			double total = subtotal - discountAmount;
			
			//format and display
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			
			System.out.println("Discount Percent: " + percent.format(discountPercent) + "\n"
			+ "Discount Amount: " + currency.format(discountAmount) + "\n"
			+ "Total: " + currency.format(total) + "\n");
			
			System.out.print("Continue? y/n: ");
			choice = sc.nextLine();
			if(choice.equalsIgnoreCase("n")){
				sc.close();
				break;
			}
		}

		
	}

}
