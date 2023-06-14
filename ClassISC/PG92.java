import java.util.Scanner;
public class PG92 {
     
    public static void main(String[] args) {
        System.out.println("Enter the Limit=");
        Scanner ti=new Scanner(System.in);
        String a[]=new String ['z'];
        int z=ti.nextInt();
        System.out.println("Enter the Strings=");
        int i;
        for(i=0;i<z;i++){
            a[i]=ti.next();
        }
        System.out.println("Massage-Data Stored Successfully.");

    }
}
