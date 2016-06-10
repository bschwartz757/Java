
public class ProductDB {
	public static Product getProduct(String productCode){
		
		//create instance of Product object
		Product product = new Product();
		
		//fill the Product object with data
		product.setCode(productCode);
		if(productCode.equalsIgnoreCase("java")){
			product.setDescription("cool Java book");
			product.setPrice(55.55);
			
		}else if(productCode.equalsIgnoreCase("jsp")){
			product.setDescription("amazing java servlets book");
			product.setPrice(60.00);
		}else if(productCode.equalsIgnoreCase("mysql")){
			product.setDescription("great mysql book");
			product.setPrice(45.00);
		}
		return product;
	}
}
