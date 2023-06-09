
import java.util.Scanner;
public class PG22 {

	public static void main(String[] args) {
         Scanner ti=new Scanner(System.in);	
         System.out.println("Enter the Days =");
         int y=ti.nextInt();
         int ye=y/365;
         int w=(y-365)/7;
         int da=(y-365)%7;
         System.out.println("Year ="+ye);
         System.out.println("Week ="+w);
         System.out.println("Day ="+da);
	}

}
