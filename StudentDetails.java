package Assignment;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {

	   Scanner sc=new Scanner(System.in);
		
       Student s1 = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
       
      
       
       Student s2 = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
       
       s2.display();
       
       Student s3 = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
       
       s1.display();
       s2.display();
       s3.display();

	}

}
