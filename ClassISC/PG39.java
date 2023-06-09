import java.util.Scanner;

public class PG39 {

	public static void main(String[] args) {
		System.out.println("Finding Second Greatest Number.");
		Scanner ti=new Scanner(System.in);
		 
          System.out.println("Enter the First Number:");
          int a=ti.nextInt(); 
          
          System.out.println("Enter the Second Number:");
          int b=ti.nextInt();
           
          System.out.println("Enter the Third Number:");
          int c=ti.nextInt(); 
            
             if(a>b && a>c) {
            	 System.out.println("A is First Greatest Number.");
            	 if(b>c){
            		 System.out.println("B is Greatest Number.");
            	 }else {
            		 System.out.println("C is Greatest Number.");
            	 }
            		 
             }else if(b>c && b>a) {
                 System.out.println("B is First Greatest Number.");
                 if(c>a){
                	 System.out.println("C is Greatest Number.");
                 }else {
                	 System.out.println("A is Greatest Number.");	
             }  
                 
             }else if(c>a && c>b){
                System.out.println("C is First Greatest Number.");
                if(a>b){
                	 System.out.println("A is Greatest Number.");
                 }else {
                     System.out.println("B is Greatest Number.");     
            
             }
         }
             
              
               
             
	}

}

