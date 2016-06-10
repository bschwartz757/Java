import java.util.Scanner;

public class RectangleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Rectangle Calculator");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y")){
			System.out.println("Enter the length: ");
			double length = Double.parseDouble(sc.nextLine());
			
			System.out.println("Enter the width: ");
			double width = Double.parseDouble(sc.nextLine());
			
			//crate object
			Rectangle r = new Rectangle(length, width);
			
			//format and display output
			String message = "Area: " + r.getAreaNumberFormat() + "\n"
					+ "Perimeter: " + r.getPerimeterNumberFormat() + "\n";
			
			System.out.println(message);
			
			//see if user wants to continue
			System.out.println("Do you want to continue? y/n: ");
			choice = sc.nextLine();
		}
		
		sc.close();
		System.out.println("goodbye");
	}

}
