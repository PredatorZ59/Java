import java.util.Scanner;

import javax.swing.text.Position;
public class PG94 {
    
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

        for(i=0;i<z;i++){
            System.out.println("The Elements Entered Are:"+a[i]);
        }

        System.out.println("Enter the Position=");
        int g=ti.nextInt();
       
        for(i=0;i<z;i++){
            if(g==a[i])

            System.out.println("Element is:"+i);
            
        }
    }
}
