
import java.util.Scanner;

public class PG14 {

	public static void main(String[] args) {
		System.out.println("To find the Diameter and Circumference");
		Scanner ti=new Scanner(System.in);
		System.out.println("Enter the Radius :");
		int a=ti.nextInt();
		double p=3.14;
		int dia=a*a;
		double cir=2*p*a;
		  System.out.println("The Diameter of Circle is : "+dia);
		  System.out.println("The Circumference of Circle is : "+cir);
		

	}

}
