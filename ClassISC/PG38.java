
import java.util.Scanner;

public class PG38 {

	public static void main(String[] args) {
	
		System.out.println("Candidate Grade Finder Vr-1.0.2");
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
	    System.out.println("Categorys OF Grades:-   0-35= Fail_____35-55= Pass_____55-75= GradeA_____75-100= Distinction_____.");
	    
	    int in=per;
	    
	    if (in>=0 && in<35)
	    {System.out.println("The Candidate Grades=Fail.");
	    }
	    
	    else if (in>=35 && in<55)
	    {System.out.println("The Candidate Grades=Pass.");
	    }
	    
	    else if (in>=55 && in<75)
	    {System.out.println("The Candidate Grades=Grade A.");
	    }
	    
	    else if (in>=75 && in<=100)
	    {System.out.println("The Candidate Grades=Distinction.");
	    }

	}

}
