import java.util.Scanner;
public class IT24100988Lab4Q3
{
  public static void main(String[]args)
   
  {
        
	 int number;
	 String message;
		
		Scanner input=new Scanner(System.in);
	    System.out.print("Enter a number: ");
		number=input.nextInt();
		
		
		message = (number < 0) ? "The number is : Negative " : 
		
		(number > 0) ? "The number is : positive ": "The number is : zero ";
		
		
			System.out.print(message);
			
		    
		
		
		
		
		
		
		
		
		
  }
}