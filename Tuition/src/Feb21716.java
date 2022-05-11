import java.util.*;
import java.util.Scanner;


public class Feb21716 {
 public static void main(String[] args) {

double total;

System.out.println("Enter your wireless service carrier plan" 
+ "\n Package A: For $29.99 per month 2GB of data is provided. Additional data is $10.00 per GB." 
+ "\n Package B: For $39.99 per month 4GB of data is provided. Additional data is $5.00 per GB. "
+ "\n Package C: For $49.99 per month unlimited data is provided."
+ "\n Please enter only the letter in Upper Case ex. Package A = A");
Scanner sc = new Scanner(System.in);
String whichPackage = sc.nextLine();

System.out.println("Please enter the Amount of additional hours" );
Scanner dText = new Scanner(System.in);
double hours = dText.nextDouble();




	if(( whichPackage .equals( "A" ))&&(hours <= 0)){
		
    total = 10.00;
    System.out.println("Your Bill is: " +(total));
    
} else if(( whichPackage .equals( "A" ))&&(hours > 0)) {
    
    total = 10 + 2 * (hours);  
    System.out.println("Your Bill is RM: " + (total));
    
} else if(( whichPackage .equals( "B" ))&&(hours <= 0)) {
    
   total = 20.00; 
   System.out.println("Your Bill is: " + (total));

} else if(( whichPackage .equals( "B" ))&&(hours > 0)){
   
    total = 20.00 + 1.50 * (hours);
    System.out.println("Your Bill is: " + (total));

} else if(( whichPackage .equals( "C" ))&&(hours <= 0)){
    
    total = 30.00;
    System.out.println("Your Bill is: " + (total));

} else if(( whichPackage .equals( "C" ))&&(hours > 0)){
   
	total = 30.00 + 1.00 * (hours);
    System.out.println("Your Bill is: " + (total));
	
}
  else if(( whichPackage .equals( "D" ))&&(hours <= 0)){
	    
	    total = 50.00;
	    System.out.println("Your Bill is: " + (total));

	} else if(( whichPackage .equals( "D" ))&&(hours > 0)){
	   
		total = 50.00 + 0.50 * (hours);
	    System.out.println("Your Bill is: " + (total));
		
}
	else 
	{
	System.out.println("You didnt enter a valid number ");
}


}
}