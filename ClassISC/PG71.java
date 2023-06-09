
import java.util.Scanner;

public class PG71 {

	public static void main(String[] args) {
		
		Scanner ti=new Scanner(System.in);
		int a=1;
		System.out.println("Enter The Number:");
		int u=ti.nextInt();
		
		for(a=1;a<=u;a++)
		if(0!=a%2)
		{System.out.println(a);
		a++;
		}

	}

}
