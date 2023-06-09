
import java.util.Scanner;

public class PG32 {

	public static void main(String[] args) {
		Scanner ti=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=ti.nextInt();
		
		if(a<=10)
		{    System.out.println("The Number is Between 0 TO 10.");
	}
		
		else if(a<=20)
		{    System.out.println("The Number is Between 10 TO 20.");
	}
		    
		else if (a<=30)
		{	System.out.println("The Number is Between 20 TO 30.");
	}
		
		else if (a<=40)
		{	System.out.println("The Number is Between 30 TO 40.");
	}
		
		else 
		{ System.out.println("This is Not valid.");
   }			
		}

   }
