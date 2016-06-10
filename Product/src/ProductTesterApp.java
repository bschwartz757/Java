
public class ProductTesterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Product Tester");
		
		//create Product object (default constructor)
		Product product = new Product();
		
		String message = "\nProduct\n"
				+ "Code: " + product.getCode() + "\n"
				+ "Description: " + product.getDescription() + "\n"
				+ "Price: " + product.getPriceFormatted() + "\n";
		
		System.out.println(message);
		
		//code the custom constructor
		product = new Product("mysql", "this is a fantastic book", 54.05);
		
		message = "\nProduct\n"
				+ "Code: " + product.getCode() + "\n"
				+ "Description: " + product.getDescription() + "\n"
				+ "Price: " + product.getPriceFormatted() + "\n";		
		
		System.out.println(message);
		
		//set data in the product object
		product.setCode("java");
		product.setDescription("an awesome book");
		product.setPrice(45.50);
		
		message = "\nProduct\n"
				+ "Code: " + product.getCode() + "\n"
				+ "Description: " + product.getDescription() + "\n"
				+ "Price: " + product.getPriceFormatted() + "\n";		
		
		System.out.println(message);		
	}

}
