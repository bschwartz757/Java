
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array syntax
		/*int[] values = new int[10];
		
		for(int i = 0; i < values.length; i++){
			values[i] = i;
			
			System.out.println(values[2]);
		}*/
		
		/*double[] prices = {14.95, 12.95, 11.95, 9.95};
		
		double sum = 0.0;
		for (int i = 0; i <prices.length; i++){
			sum += prices[i];
			System.out.println(sum);			
		}
		double average = sum/prices.length;
		System.out.println(average);*/
		
		//Enhanced for loop
		/*double[] prices = {14.95, 12.95, 11.95, 9.95};
		
		for(double price : prices){
			double sum = 0.0;			
			sum += prices;
			System.out.println(sum);
		}
		double average = sum/prices.length;
		System.out.println(average);*/	
		
		//Rectangular array
		/*int[][] numbersTable = {{1,2}, {3,4}, {5,6}};
		
		for(int[] row : numbersTable){
			for(int column : row){
				System.out.print(column + " ");
			}
				System.out.print("\n");
		}*/
		
		String[] productCodes = {"mysql", "jsp", "java"};
		
		Arrays.sort(productCodes);
		int index = Arrays.binarySearch(productCodes, "mysql");
	}


}
