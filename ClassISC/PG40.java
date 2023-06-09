import java.util.Scanner;
public class PG40 {

	public static void main(String[] args) {
		
		//input
		
		System.out.println("$$$Currency$Counter$$$");
		Scanner ti=new Scanner(System.in);
		
		System.out.println("Enter The Amount:");
		
		int a=ti.nextInt();
		
		int C2000=a/2000;
		a=a%2000;
		
		int C500=a/500;
		a=a%500;
		
		int C200=a/200;
		a=a%200;
		
		int C100=a/100;
		a=a%100;
		
		int C50=a/50;
		a=a%50;
				
		int C20=a/20;
		a=a%20;
		
		int C10=a/10;
		a=a%10;
		
		int C5=a/5;
		a=a%5;
		
		int C2=a/2;
		a=a%2;
		
		int C1=a/1;
		
		//output
		
		System.out.println("Currency Notes :-");
		System.out.println("2000="+C2000);
		System.out.println("500="+C500);
		System.out.println("200="+C200);
		System.out.println("100="+C100);
		System.out.println("50="+C50);
		System.out.println("20="+C20);
		System.out.println("10="+C10);
		System.out.println("5="+C5);
		System.out.println("2="+C2);
		System.out.println("1="+C1);
		
		System.out.println("<*/////*THANK YOU FOR USING MY PROGRAM!*/////*>");

	}

}
