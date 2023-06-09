
import java.util.Scanner;

public class PG63 {

	public static void main(String[] args) {
		
		Scanner ti=new Scanner(System.in);
		System.out.println("Enter the Character(Enter In Upper Case)=");
		
		char a='A';
		char u=ti.next().charAt(0);	
		
		do
		{System.out.println(a);
        a++;
        }
	    while(a<=u);	
		
	}

}
