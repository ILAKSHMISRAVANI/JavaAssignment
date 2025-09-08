// Swapping of Two Numbers without third variable
import java.util.*;

public class Swap
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
	    System.out.println("Before Swapping of two numbers is "+a +" and b is "+b);
	    
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping of two numbers is "+a +" and b is "+b);
	}
}
