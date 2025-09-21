package assignments;

import java.util.Scanner;

// Encapsulation

class BankAccount {
    
	// Bank Account holder Details
	int Acctnum;
	double balance;
	String username="";
	
	// Initialize Account holder details
	public BankAccount(int Acctnum,String username, double balance) {
		
		this.Acctnum = Acctnum;
		this.balance = balance;
		this.username = username;
		
	}
  
	public double getBalance() {
		return balance;
	}
	
	// Bank Transaction Operations
	
	public void deposit(double amt) {
		balance += amt;
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Deposited the amount "+amt+" Successfully!!\n Current balance is "+balance);
		System.out.println("-------------------------------------------------------------------------");
		
	}
	
	public void withDraw(double amt) {
		
		if(amt <= balance) {
			
			balance -= amt;
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Withdrawn the amount "+amt+" Successfully!!\n Current balance is "+balance);
			System.out.println("-------------------------------------------------------------------------");
		}
		else {
			System.out.println(" Insufficient Balance!!! ");
		}
		
	}
	
}

// Main Class
public class BankDemo{
	
	     public static void main(String[] args) {
			
	    	 
	    	 Scanner sc=new Scanner(System.in);
	    	 System.out.println("----------------------------------------------------");
	    	 System.out.println("------ Welcome Bank Account Holder!!!! -------------");
	    	 
	    	 System.out.println("------------ Enter Account Holder Details ----------");
	    	 BankAccount ac1 = new BankAccount(sc.nextInt(),sc.next(),sc.nextDouble());
	    	 
	    	 
	    	 System.out.println("----------------------------------------------------");
	    	 ac1.getBalance();
	    	 
	         ac1.withDraw(67890);
	         ac1.getBalance();
	    	 	
	    	 
	    	 ac1.deposit(3400);
	    	 ac1.getBalance();
	    	 
	    	 
	    	 ac1.withDraw(5600);
	    	 ac1.getBalance();
	    	 
		}
}

