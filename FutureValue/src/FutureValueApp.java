import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//user greeting
		System.out.println("Welcome to the Future Value Calculator!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")){
			
			//get user input
			System.out.print("Enter monthly investment: ");
			double monthlyInvestment = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter monthly interest rate: ");
			double yearlyInterestRate = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter number of years: ");
			int years = Integer.parseInt(sc.nextLine());
			
			//convert yearly values to monthly values
			double monthlyInterestRate = yearlyInterestRate / 12 / 100;
			int months = years * 12;
			
			//calculate future value
			double futureValue = 0;
			int i = 1;
			while(i <= months){
				futureValue = futureValue + monthlyInvestment;
				double monthlyInterestAmount = futureValue * monthlyInterestRate;
				futureValue = futureValue + monthlyInterestAmount;
				
				i = i + 1;
			}
			//format and display result
			System.out.println("Future Value: " + NumberFormat.getCurrencyInstance().format(futureValue));
			System.out.println();
			
			//check to see if the user wants to continue
			System.out.println("Continue? y/n");
			choice = sc.nextLine();
		}
		sc.close();
		System.out.println("Bye");
		
	}

}
