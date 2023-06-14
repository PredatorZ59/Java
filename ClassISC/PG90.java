import java.util.Scanner;
public class PG90 {
    
    public static void main(String[] args) {
        System.out.println("Enter the Limit=");
        Scanner ti=new Scanner(System.in);
        char a[]=new char ['z'];
        int z=ti.nextInt();
        System.out.println("Enter the Character=");
        int i;
        for(i=0;i<z;i++){
            a[i]=ti.next().charAt(0);
        }
        System.out.println("Massage-Data Stored Successfully.");

    }
}
