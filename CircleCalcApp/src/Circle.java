
public class Circle {

	private double radius;
	private double pi = 3.14159;
	
	//default constructor
	public Circle(){
		radius = 0.0;
	}
	
	//custom constructor
	public Circle(double radius){
		this.radius = radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	//get method for Radius (user input)
	public double getRadius(){
		return radius;
	}
	
	public double getDiameter(){
		return radius * 2;
	}
	
	public double getCircumference(){
		return 2 * pi * radius;
	}
	
	public double getArea(){
		return pi * radius * radius;
	}
}
