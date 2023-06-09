
import java.util.Scanner;

public class PG52 {

	public static void main(String[] args) {
		Scanner ti=new Scanner(System.in);
		System.out.println("Enter the Character=");
		
		char a='A';
		char u=ti.next().charAt(0);	
		
	    while (a<=u) 	
		{System.out.println(a);
         a++;
		}
	}

}
