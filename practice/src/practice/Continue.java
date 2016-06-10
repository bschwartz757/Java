package practice;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++){
			int random = (int)(Math.random() * 10);
			if(random > 7){
				System.out.println("invalid value - continue loop!");
				continue;
			}
			System.out.println(random);
		}
	}

}
