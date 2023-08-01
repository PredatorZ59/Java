import java.util.Scanner;

public class PRo1 {
    public static int roll;
    public static String name;
    public static String add;
    public static String phone;
    public static int sclass;
    public static int marks;
    public static int o;
    public static int ii;
    public static int i;
    public static int num;
    public static int n;

    public static void main(String[] args) {
        Scanner ti = new Scanner(System.in);
        int i=1;
        PRo1 p[] = new PRo1[100];
        System.out.println("Welcome to ***Predator*** Record Storage System!");

        System.out.println("Enter Usename=");
        int uu = ti.nextInt();
        System.out.println("Enter Password=");
        int pp = ti.nextInt();

        if (uu == 569 && pp == 123) {
            System.out.println("Welcome Predator!");

            for (i = 0; i < 6;) {

                System.out.println("1.Add Records");
                System.out.println("2.View Records");
                System.out.println("3.Search Records");
                System.out.println("4.Update Records");
                System.out.println("5.Result");
                System.out.println("6.Exit");
                System.out.println("Enter the option=");
                o = ti.nextInt();
            

                if (o == 1) {
                    System.out.println("How many Record do you want to add?");
                    int n = ti.nextInt();

                    for (num = 0; num != n; num++) {

                        System.out.println("Enter Student Roll Number=");
                        p[num].roll =ti.nextInt();

                        System.out.println("Enter Student Name=");
                        p[num].name =ti.next();

                        System.out.println("Enter Student Address=");
                        p[num].add = ti.next();

                        System.out.println("Enter Student phone Number=");
                        p[num].phone = ti.next();

                        System.out.println("Enter Student Class=");
                        p[num].sclass = ti.nextInt();

                        System.out.println("Enter Student Marks=");
                        p[num].marks = ti.nextInt();

                        System.out.println("DATA Stored Successfully!");
                    }
                }

                if (o == 2) {
                    System.out.println("The Records Stored=>");
                    System.out.println("Roll Number \t"+"Name \t"+"Address \t"+"Phone Number \t"+"Class \t"+"Marks \t");
                    for (num = 0; num == n;) {
                       System.out.println(p[num].roll+"\t"+p[num].name+"\t"+p[num].add+"\t"+p[num].phone+"\t"+p[num].sclass+"\t"+p[num].marks+"\t");
                   }
                }

            if (o == 3) {
                System.out.println("Enter the roll number to search=");
            }

            if (o == 4) {
                System.out.println("Enter the roll number to update=");
            }
            if (o == 5) {

            }

            if (o == 6) {
                i = 7;
                System.out.println("Session Ended!");

            }
        }

    }

        else if (uu != 569) {
            System.out.println("You Have Enter Incorrect Username!");
        }

        else if (pp != 123) {
            System.out.println("You Have Enter Incorrct Password!");
        }

    
    }
}

