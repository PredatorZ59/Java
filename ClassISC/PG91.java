import java.util.Scanner;
public class PG91 {
    
    public static void main(String[] args) {
        System.out.println("Enter the Limit=");
        Scanner ti=new Scanner(System.in);
        Double a[]=new Double ['z'];
        int z=ti.nextInt();
        System.out.println("Enter the Decimal Number=");
        int i;
        for(i=0;i<z;i++){
            a[i]=ti.nextDouble();
        }
        System.out.println("Massage-Data Stored Successfully.");

    }
}
