
import java.util.Scanner;
public class PG18 {

	public static void main(String[] args) {
		System.out.println("Subject Marks Percentage Finder Vr-1.0.1");
		Scanner ti=new Scanner(System.in);
		System.out.println("Enter the Subject 1 Marks-");
		int o=ti.nextInt();
		System.out.println("Enter the Subject 2 Marks-");
		int t=ti.nextInt();
		System.out.println("Enter the Subject 3 Marks-");
		int th=ti.nextInt();
		System.out.println("Enter the Subject 4 Marks-");
		int f=ti.nextInt();
		System.out.println("Enter the Subject 5 Marks-");
		int fi=ti.nextInt();
		int tot=o+t+th+f+fi;
		System.out.println("Total Marks Obtained by the Candidate="+tot);
	    int per=tot*100/500;
	    System.out.println("Total Marks Obtained by the Candidate in Percentage="+per);
	    
		
		
	}

}
