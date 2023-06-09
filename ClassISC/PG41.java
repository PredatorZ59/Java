
import java.util.Scanner;

public class PG41 {
	
	public static void main(String[] args) {
		
		Scanner ti=new Scanner(System.in);
		
		System.out.println("Enter The Angle 1:");
		int a=ti.nextInt();
		
		System.out.println("Enter The Angle 2:");
		int b=ti.nextInt();
		
		System.out.println("Enter The Angle 3:");
		int c=ti.nextInt();
		
		if(a+b+c==180)
		{System.out.println("The Triangle is Valid :-)");
		}
		
		else if(a+b+c!=180)
		{System.out.println("The Tiangle is Not Valid :-(");
		}
		
		

	}

}
