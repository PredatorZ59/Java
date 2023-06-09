

import java.util.Scanner;

public class PG35 {

	public static void main(String[] args) {
		
		Scanner ti=new Scanner(System.in);
		System.out.println("Enter the Number:");
		char cd=ti.next().charAt(0);
		
		if (cd>='A' && cd<='Z')
		{	System.out.println("This is not a Number.");
		}
		 
		else if (cd>='a' && cd<='z')
		{	System.out.println("This is not a Number.");
		}	
	
		else if (cd>=0)
		{	System.out.println("This is a Number.");
		}	

	}

}

	
