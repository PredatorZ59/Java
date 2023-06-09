
import java.util.Scanner;

public class PG37 {

	public static void main(String[] args) {
		 
		Scanner ti=new Scanner(System.in);
		System.out.println("Enter the Character:");
		char cd=ti.next().charAt(0);
		
		if (cd>='A' && cd<='Z')
		{	System.out.println("This is a Upper Case Letter.");
		}
		 
		else if (cd>='a' && cd<='z')
		{	System.out.println("This is a Lower Case Letter.");
		}	

		else if (cd>=0 && cd<=9)
		{	System.out.println("This is a Number.");
		}
		
		else
		{	System.out.println("This is a Special Character.");
		}
	}

}
