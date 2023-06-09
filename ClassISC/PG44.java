
import java.util.Scanner;

public class PG44 {

	public static void main(String[] args) {
		
		 Scanner ti=new Scanner(System.in);
		  System.out.println("Enter the Number A=");
		  int a=ti.nextInt();
		  System.out.println("Enter the Number B=");
		  int b=ti.nextInt();
		  System.out.println("Enter the Number C=");
		  int c=ti.nextInt();
		  
		    if (a>b)
	        {System.out.println("A is Greater.");
            }
		  
		    else if (b>c)
	        {System.out.println("B is Greater.");
            }
		  
		    else if (c>a)
		    {System.out.println("C is Greater.");
            }
		  
		    else if(a!=b && b==c &&c==a)
			{System.out.println("The Number B and C are Same.");
			}
			
			else if(a==b && b!=c &&c==a)
			{System.out.println("The Number A and C are Same.");
			}
			
			else if(a==b && b==c &&c!=a)
			{System.out.println("The Number A and B are Same.");
			}
		    
			else if(a==b && b==c &&c==a)
			{System.out.println("All Numbers are Same.");
			}
		    
		    

	}

}
