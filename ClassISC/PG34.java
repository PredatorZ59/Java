
import java.util.Scanner;

public class PG34 {

	public static void main(String[] args) {
		
		Scanner ti=new Scanner(System.in);
		System.out.println("Enter the Character:");
		char ch=ti.next().charAt(0);
		
		if (ch>='A' && ch<='Z')
		{	System.out.println("This is a Character.");
		}
		 
		else if (ch>='a' && ch<='z')
		{	System.out.println("This is a Character.");
		}	
	
		else 
		{	System.out.println("This is not a Character.");
		}	

	}

}
