
import java.util.Scanner;

public class PG73 {

	public static void main(String[] args) {
		
		Scanner ti=new Scanner(System.in);
		int y = 0;
		int a=1;
		System.out.println("Enter The Limit: ");
		int u=ti.nextInt();
		
		for(a=1;a<=u;a++)
		{
			System.out.println(a);
			y=y+a;
		}
		System.out.println("Addition is : "+y);
		
		
		
		

	}

}
