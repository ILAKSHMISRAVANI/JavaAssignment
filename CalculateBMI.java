/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.math.*;
import java.util.*;
public class CalculateBMI
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double weight = sc.nextDouble();
		double height = sc.nextDouble();
		
		double BMI = (double) weight / (height * height);
		BigDecimal a = new BigDecimal(BMI);
		a = a.setScale(2,RoundingMode.HALF_UP);
		
		System.out.println("Your BMI is "+ a);
	}
}