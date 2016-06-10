package practice;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true){
			int random = (int)(Math.random() * 10);
			System.out.println(random);
			if(random == 5){
				System.out.println("Value found - exit loop!");
				break;
			}
		}
	}

}
