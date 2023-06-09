
import java.util.Scanner;
public class PG30 {

	public static void main(String[] args) {
		System.out.println("Are you eligable for Driving? Let's Test.");
       
		Scanner ti =new Scanner(System.in);
		
		System.out.println("Enter The Age :" );
		int a=ti.nextInt();
		
		{
			if(a>=18)		
				System.out.println("Congrat's! You are Eligable For Driving.");

			else
				System.out.println("Sorry! You are not Eligable For Driving.");
			
}
}
}
