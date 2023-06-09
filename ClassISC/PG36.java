
import java.util.Scanner;

public class PG36 {

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
	
	}

}
