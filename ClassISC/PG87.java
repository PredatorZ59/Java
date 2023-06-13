import java.util.Scanner;
public class PG87 {
    
    public static void main(String[] args) {
        System.out.println("The Limit is 10.");
        Scanner ti=new Scanner(System.in);
        System.out.println("Enter the Decimal Numbers=");
        double a[]=new double[10];
        int i;
        for(i=0;i<10;i++){
            a[i]=ti.nextDouble();
        }
        System.out.println("Massage-Data Stored Successfully.");


    }
}
