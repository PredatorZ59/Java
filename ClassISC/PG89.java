import java.util.Scanner;
public class PG89 {
    
    public static void main(String[] args) {
        System.out.println("Enter the Limit=");
        Scanner ti=new Scanner(System.in);
        int a[]=new int ['z'];
        int z=ti.nextInt();
        System.out.println("Enter the Number=");
        int i;
        for(i=0;i<z;i++){
            a[i]=ti.nextInt();
        }
        System.out.println("Massage-Data Stored Successfully.");

    }
}
