import java .util.Scanner;
public class PG86 { 

    public static void main(String[] args) {

        System.out.println("The Limit is 10");
        Scanner ti=new Scanner (System.in);
        System.out.println("Enter the Characters=");
        char a[]=new char[10];
        int i;
        for(i=0;i<10;i++){
            a[i]=ti.next().charAt(0);
        }
        System.out.println("Massage-Data Stored Successfully.");
        
        
    }
}
