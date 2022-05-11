import java.util.*;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class InternetPlan {
	  

	public static void main(String[] args) { 
		
		double total;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println(
				"\n Package A: RM10 monthyly, Rm2.00 every additional hour" 
				+ "\n Package B: RM20 monthyly, Rm1.50 every additional hour. "
				+ "\n Package C: RM30 monthyly, Rm1.00 every additional hour" 
				+ "\n Package D: RM50 monthyly, Rm0.50 every additional hour"
				+"\nEnter your plan: ");
		String n = scan.nextLine();	
		
		System.out.print("Enter the hours: \n");
		Scanner input = new Scanner(System.in);
		int hours = input.nextInt();
	
		if(( n .equals( "A" ))&&(hours <= 0)){
			
		    total = 10.00;
		    System.out.println("Your charges this month is RM: " +(total));
		    
		} else if(( n .equals( "A" ))&&(hours > 0)) {
		    
		    total = 10 + 2 * (hours);  
		    System.out.println("Your charges this month is RM: " +(total));
		   
		} else if(( n .equals( "B" ))&&(hours <= 0)) {
		    
		   total = 20.00; 
		   System.out.println("Your charges this month is RM: " +(total));

		} else if(( n .equals( "B" ))&&(hours > 0)){
		   
		    total = 20.00 + 1.50 * (hours);
		    System.out.println("Your charges this month is RM: " +(total));

		} else if(( n .equals( "C" ))&&(hours <= 0)){
		    
		    total = 30.00;
		    System.out.println("Your charges this month is RM: " +(total));

		} else if(( n .equals( "C" ))&&(hours > 0)){
		   
			total = 30.00 + 1.00 * (hours);
			 System.out.println("Your charges this month is RM: " +(total));
			
		}
		  else if(( n .equals( "D" ))&&(hours <= 0)){
			    
			    total = 50.00;
			    System.out.println("Your charges this month is RM: " +(total));

			} else if(( n .equals( "D" ))&&(hours > 0)){
			   
				total = 50.00 + 0.50 * (hours);
				 System.out.println("Your charges this month is RM: " +(total));
				
		}
			else 
			{
			System.out.println("You didnt enter a valid package ");
		}

		


}
		
}