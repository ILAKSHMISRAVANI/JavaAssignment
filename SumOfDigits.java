// Java program to find sum of the digits
import java.util.Scanner;

public class SumOfDigits
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		while(num!=0){
		    sum += num%10;
		    num /= 10;
		}
		
		System.out.println("The sum of the digits is "+sum);
	}
}