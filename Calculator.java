/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Calculator
{
	public static void main(String[] args) {
	   
	   System.out.println("-----------------------------------------");
	   System.out.println("**********Simple Calculator *************");
		
	   int a = Integer.parseInt(args[0]);
	   int b = Integer.parseInt(args[1]);
	   char operator = Character.parseChar(args[2]);
	  
	   switch(operator){
	       
	       case '+':
	                 System.out.println("Addition of two numbers is "+(a+b));
	                 break;
	       
	       case '-':
	                 System.out.println("Subtraction of two numbers is "+(a-b));
	                 break;
	       
	       case '*':
	                 System.out.println("Multiplication of two numbers is "+(a*b));
	                 break;
	       
	       case '/':
	                 System.out.println("Division of two numbers is "+(a/b));
	                 break;
	                 
	       default :
	                 System.out.println("Enter valid operator for calculation");
	                 break;
	   }
	   
	   System.out.println("--------------------------------------------");
	}
}
