package blake.business;

import java.text.NumberFormat;

public class Product implements Printable {
	private String code;
	private String description;
	private double price;

	public Product(String code, String description, double price){
		this.code = code;
		this.description = description;
		this.price = price;
	}
	//get and set methods for fields
	public void print(){
		System.out.println(description);
	}
}
