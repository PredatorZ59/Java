package ClassISCPra;
import java.util.Scanner;
// failed program !!!!
public class PT1 {
    public static void main(String[] args) {
        Scanner ti=new Scanner(System.in);
        System.out.println("Enter the Number 1=");
        int a=ti.nextInt();
        System.out.println("Enter the Number 2=");
        int b=ti.nextInt();
        System.out.println("Enter the Number 3=");
        int c=ti.nextInt();

        if(a>b){
            System.out.println("Num 1 is greater than Num 2");
        }

        else if(a>c){
            System.out.println("Num 1 is greater than Num 3");
        }

        else if(b>a){
            System.out.println("Num 2 is greater than Num 1");
        }

        else if(b>c){
            System.out.println("Num 2 is greater than Num 3");
        }
        
        else if(c>a){
            System.out.println("Num 3 is greater than Num 1");
        }

        else if(c>b){
            System.out.println("Num 3 is greater than Num 2");
        }
    }
    
}
