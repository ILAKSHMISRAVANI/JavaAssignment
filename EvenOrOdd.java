// To Find Odd or Even Number
import java.util.*;
public class EvenOrOdd
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int a = sc.nextInt();
	    
	    if(a % 2 != 0){
	        System.out.println("The number "+ a +" is an Odd Number.");
	    }
	    else{
	        System.out.println("The number "+ a +" is an even Number.");
	    }
	}
}
