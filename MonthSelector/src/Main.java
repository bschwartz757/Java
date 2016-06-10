
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] monthName = {"January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", 
				"November", "December"};
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")){
				int monthNumber = Console.getInt("Enter month number: ");
				
				//validate input
				if(monthNumber < 1 || monthNumber > monthName.length){
					Console.displayLine("Invalid input. Please try again");
					continue;
				}
				//display output
				int monthIndex = monthNumber -1;
				Console.displayLine("You selected: " + monthName[monthIndex] + "\n");
				
				choice = Console.getString("Continue? y/n: ");
				System.out.println();
	}
	}
}
