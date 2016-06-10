package a4.business;

import java.text.NumberFormat;

public class Customer {
	private String name;
	private String address;
	private String city;
	private String state;
	private String postalCode;
	
	public Customer(){
		name = "";
		address = "";
		city = "";
		state = "";
		postalCode = "";
	}
	
	public Customer(int customerNumber, String name, String address, String city, String state, String postalCode){
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}
	
    public void setName(String name) {
        this.name = name;
    }
	
    public String getName() {
        return name;
    }

    public void setAddress(String address){
    	this.address = address;
    }
    
    public String getAddress(){
    	return address;
    }
    
    public void setCity(String city){
    	this.city = city;
    }
    
    public String getCity(){
    	return city;
    }
    
    public void setState(String state){
    	this.state = state;
    }
    
    public String getState(){
    	return state;
    }
    
    public void setpostalCode(String postalCode){
    	this.postalCode = postalCode;
    }
    
    public String getpostalCode(){
    	return postalCode;
    }
    
    public String getNameAndAddress(){
				return "\n" + getName() + "\n"
    					+ getAddress() + "\n"
    					+ getCity() + ", "
    					+ getState() + " "
    					+ getpostalCode();
    }
    
     

}
