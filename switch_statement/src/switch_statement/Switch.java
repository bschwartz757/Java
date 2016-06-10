package switch_statement;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String productID = "hm00";
		
		//switch statement
		switch(productID){
		case "hm01":
			System.out.println("Hammer");
			break;
		case("bn03"):
			System.out.println("Box of nails");
			break;
		default:
			System.out.println("Product not found");
			break;
		}
		
		String numbers = "";
		for(int i = 0; i < 5; i++){
			numbers += i;
			numbers += " ";
		}
		System.out.println(numbers);		
	}

}
