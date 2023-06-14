import java.util.Scanner;
public class PG93 {
    
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
        int b=2;
		int c=0;
		for(i=0;i<z;i++){
			if (c==a[i]%b)
				System.out.println("The Even Number in Array:"+a[i]);
                }

    }
}
