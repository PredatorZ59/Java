package ClassISCPra;
import java.util.Scanner;

public class PT2 {
    public static void main(String[] args) {
        Scanner ti=new Scanner(System.in);
        System.out.println("Enter the number 1=");
        int a=ti.nextInt();

        System.out.println("Enter the number 2=");
        int b=ti.nextInt();

        System.out.println("Enter the number 3=");
        int c=ti.nextInt();

        if(a>b){
            System.out.println("A is greater than B");
        }
    
        if(b>c){
            System.out.println("B is greater than C");
        }

        if(c>a){
            System.out.println("C is greater than A");
        }
    }
}
