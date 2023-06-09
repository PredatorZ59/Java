
import java.util.Scanner;

public class PG15 {

	public static void main(String[] args) {
          Scanner ti=new Scanner(System.in);
          System.out.println("Enter");
          int a=ti.nextInt();
          System.out.println("Enter");
          int b=ti.nextInt();
          int addi=a+=b;
          int subi=a-=b;
          int multi=a*=b;
          int divi=a/=b;
          int modi=a%=b;
          System.out.println("addi a"+addi);
          System.out.println("subi a"+subi);
          System.out.println("multi a"+multi);
          System.out.println("divi a"+divi);
          System.out.println("modi a"+modi);
          
	}

}
