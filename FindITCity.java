/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class FindITCity
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String city = sc.nextLine();
		boolean flag = false;
		
		String[] itcity = {"Delhi","Mumbai","Kolkatta","Banglore","Chennai","Hyderbad"};
		
		for(int i=0;i<itcity.length;i++){
		    
		    
		    if( itcity[i].equals(city)){
		        
		        flag = true;
		        System.out.println("Entered city is an IT city");
		        break;
		    }
		    
	    }
	    
        if(flag==false){
                System.out.println("Entered city is not an IT city");
	    }
	    
	}
	     
}