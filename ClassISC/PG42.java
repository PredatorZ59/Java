
import java.util.Scanner;

public class PG42 {
	
	public static void main(String[] args) {
		
		Scanner ti=new Scanner(System.in);
		
		System.out.println("Enter The Side 1:");
		int a=ti.nextInt();
		System.out.println("Enter The Side 2:");
		int b=ti.nextInt();
		System.out.println("Enter The Side 3:");
		int c=ti.nextInt();
		
		if(a+b==c)
		{System.out.println("The Triangle is Valid.");
		}
		
		else if(a+c==b)
		{System.out.println("The Triangle is Valid.");
		}
		
		else if(b+c==a)
		{System.out.println("The Triangle is Valid.");
		}
		
		else if(b+a==c)
		{System.out.println("The Triangle is Valid.");
		}
		
		else if(c+a==b)
		{System.out.println("The Triangle is Valid.");
		}
		
		else if(c+b==a)
		{System.out.println("The Triangle is Valid.");
		}
		
		else
		{System.out.println("THe Triangle is Not Vaild.");	
		}
		
	}

}
