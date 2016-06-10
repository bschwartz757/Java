import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Product Viewer");
		
		//create line items
		Scanner sc = new Scanner(System.in);
		String choice = "y";	
		while(choice.equalsIgnoreCase("y")){
			//get user input
			System.out.println("Enter a product code: ");
			String productCode = sc.nextLine();
			
			//get Product object
			Product product = ProductDB.getProduct(productCode);
			
			//display output
			String message = "\nProduct\n"
					+ "Code: " + product.getCode() + "\n"
					+ "Description: " + product.getDescription() + "\n"
					+ "Price: " + product.getPriceFormatted() + "\n";
			
			System.out.println(message);
			
			//ask if user wants to continue
			System.out.println("Continue? y/n");
			choice = sc.nextLine();
		}
		sc.close();
		System.out.println("Goodbye");
	}

}
