import java.text.NumberFormat;

public class Rectangle {

	//set instance variables
	private double length;
	private double width;
	
	//constructor
	public Rectangle(){
		length = 0;
		width = 0;
	}
	
	//custom constructor
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	//calculate area & perimeter
	public double getArea(){
		double area = width * length;
		return area;
	}
	
	public String getAreaNumberFormat(){
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMinimumFractionDigits(3);
		String numberFormatted = number.format(this.getArea());
		return numberFormatted;
		
	}
	
	public double getPerimeter(){
		return(2 * width + 2 * length);
	}
	
	public String getPerimeterNumberFormat(){
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMinimumFractionDigits(3);
		String numberFormatted = number.format(this.getPerimeter());
		return numberFormatted;
	}
	
}
