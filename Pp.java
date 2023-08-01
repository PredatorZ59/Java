import java.util.Scanner;

public class Pp {
    public  
        int roll;
        String name;
        String collegeName;
  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Pp p[] = new Pp[100];
        for (int i = 0; i < 3; i++) {
            p[i] = new Pp();
            System.out.println("Enter the roll ");
            p[i].roll = sc.nextInt();
            System.out.println("Enter the name ");
            p[i].name = sc.next();
            System.out.println("Enter the collegeName ");
            p[i].collegeName = sc.next();
        }
        System.out.println("Roll \t"+"Name \t"+"CollegeName ");
        for (int i = 0; i < 3; i++) {
            System.out.println(p[i].roll+"\t"+p[i].name+"\t"+p[i].collegeName);
        }
    }    
}

