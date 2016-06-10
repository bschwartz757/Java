import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Circle Calculator\n");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){
			//prompt user
			System.out.print("Enter radius: ");
			double radius = 0.0;			
			
			try{
				String input = sc.nextLine();
				radius = Double.parseDouble(input);
				
			}catch(NumberFormatException e){
				System.out.println("Error! invalid decimal. Try again.");
				continue;
			}
			
			//Instantiate new Circle object. Pass radius as argument
			Circle circle = new Circle(radius);
			 
			System.out.print("Diameter:\t" + circle.getDiameter() + "\n"
					+ "Circumference: " + circle.getCircumference() + "\n"
					+ "Area:\t\t" + circle.getArea() + "\n");
			
			System.out.print("\nContinue? y/n: ");
			choice = sc.nextLine();
			System.out.println();						
			
			if(choice.equalsIgnoreCase("n")){
				System.out.println("bye!");
				sc.close();							
				break;
			}
		}
	}

}
