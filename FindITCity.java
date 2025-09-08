//Find Entered City is IT city or not
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
