package a4.db;

import a4.business.Customer;

public class CustomerDB {

	public static Customer getCustomer(int customerNumber){
		
		//create customer object
		Customer customer = new Customer();
		
		
		//fill customer object with data
		
		if(customerNumber == 1001){
			customer.setName("Barbara White");
			customer.setAddress("3400 Richmond Parkway #3423");
			customer.setCity("Bristol");
			customer.setState("CT");
			customer.setpostalCode("06010");
		}else if(customerNumber == 1002){
			customer.setName("Karl Vang");
			customer.setAddress("327 Franklin Street");
			customer.setCity("Edina");
			customer.setState("MT");
			customer.setpostalCode("55435");
		}else if(customerNumber == 1003){
			customer.setName("Ronda Chavan");
			customer.setAddress("518 Commanche Dr.");
			customer.setCity("Greensboro");
			customer.setState("NC");
			customer.setpostalCode("27410");
		}else{
			customer = null;
		}
		return customer;
	}
}
