package murach.business;

public class Employee implements Printable, DepartmentConstants{

	private int department;
	private String firstName;
	private String lastName;
	
	public Employee (int department, String lastName, String firstName){
		this.department = department;
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	@Override
	public void print(){
		String dept = "Unknown";
		if(department == ADMIN){
			dept = "Administration";
		}else if(department == EDITORIAL){
			dept = "Editorial";
		}else if(department == MARKETING){
			dept = "Marketing";
		}
		System.out.println(firstName + " " + lastName + " (" + dept + ")");
	}
}
