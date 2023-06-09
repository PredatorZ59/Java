
import java.util.Scanner;

public class PG43 {

	public static void main(String[] args) {
		
       Scanner ti=new Scanner(System.in);
		
		System.out.println("Enter The Side 1:");
		int a=ti.nextInt();
		System.out.println("Enter The Side 2:");
		int b=ti.nextInt();
		System.out.println("Enter The Side 3:");
		int c=ti.nextInt();
		
		if(a==b && b==c &&c==a)
		{System.out.println("The Triangle is EQUILATERAL TRIANGLE.");
		}
		
		else if(a!=b && b!=c &&c==a)
		{System.out.println("The Triangle is SCALENE TRIANGLE.");
		}
		
		else if(a==b && b!=c &&c!=a)
		{System.out.println("The Triangle is SCALENE TRIANGLE.");
		}
		
		else if(a!=b && b==c &&c!=a)
		{System.out.println("The Triangle is SCALENE TRIANGLE.");
		}
		
		else if(a!=b && b!=c &&c!=a)
		{System.out.println("The Triangle is ISOSCELES TRIANGLE.");
		}
		
		else
		{System.out.println("The Triangle is Not Vaild.");	
		}
		
	}

}


