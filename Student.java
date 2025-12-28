package Assignment;

//import java.util.Date;

// Instance Class to print student details
public class Student {
     
	// Attributes
	 private String name, address;
	 private String joinyear,salary;
	 
	 // Generate Constructor 
	 public Student(String name, String address, String joinyear, String salary) {
		super();
		this.name = name;
		this.address = address;
		this.joinyear = joinyear;
		this.salary = salary;
	 }
     
     public void display() {
    	 System.out.println(name+" "+joinyear+" - "+address);
     }
	 
	 
}
