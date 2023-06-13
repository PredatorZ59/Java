import java.util.Scanner;
public class PG88 {

    public static void main(String[] args) {
        System.out.println("Then Limit is 10.");
        Scanner ti=new Scanner(System.in);
        System.out.println("Enter the Strings=");
        String a[]=new String[10];
        int i;
        for(i=0;i<10;i++){
            a[i]=ti.next();
        }
        System.out.println("Massage-Data Stored Successfully.");
    }
    
}
