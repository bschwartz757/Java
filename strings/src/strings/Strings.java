package strings;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String name = "Martin Van Buren";
		int index1 = name.indexOf(" ");
		int index2 = name.indexOf(" ", index1+1);
		
		String middleName = name.substring(7, 10);
		
		System.out.println(index1 + " " + index2 + "\n");
		System.out.println(middleName);*/
		
		/*String ccNumber = "4012-8888-8888-1881";
		String temp = "";
		for(int i = 0; i < ccNumber.length(); i++){
			if(ccNumber.charAt(i) != '-'){
				temp += ccNumber.charAt(i);
			}
		}
		ccNumber = temp;
		System.out.println(temp);*/
		
		StringBuilder name = new StringBuilder(8);
		int capacity1 = name.capacity();
		name.append("Raymond R. Thomas");
		int length = name.length();
		int capacity2 = name.capacity();
		
		System.out.println(length);
		System.out.println(capacity1);
		System.out.println(capacity2);		
		System.out.println(name);		
		
	}

}
