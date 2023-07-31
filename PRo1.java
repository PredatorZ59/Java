import java.util.Scanner;

class PRo1 {

    public static int roll;
    public static String name;
    public static String add;
    public static String phone;
    public static String sclass;
    public static String marks;
    public static int o;
    public static int ii;


    public static void main(String[] args) {
        Scanner ti = new Scanner(System.in);
        int i=0;
        System.out.println("Welcome to ***Predator*** Record Storage System!");

        System.out.println("Enter Usename=");
        int uu = ti.nextInt();
        System.out.println("Enter Password=");
        int pp = ti.nextInt();

        if (uu == 569 && pp == 123) {
            System.out.println("Welcome Predator!");

            for (i = 1; i < 6;) {

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
                    int num;

                    for (num = 0; num != n; num++) {

                        System.out.println("Enter Student Roll Number=");
                        int roll = ti.nextInt();

                        int r[] = new int[10];

                        for (ii = 0; ii < 10; ii++) {
                            r[ii] = ti.nextInt();
                        }

                        System.out.println("Enter Student Name=");
                        String name = ti.next();

                        String na[] = new String[10];

                        System.out.println("Enter Student Address=");
                        String add = ti.next();

                        System.out.println("Enter Student phone Number=");
                        String phone = ti.next();

                        System.out.println("Enter Student Class=");
                        int sclass = ti.nextInt();

                        System.out.println("Enter Student Marks=");
                        int marks = ti.nextInt();

                        System.out.println("DATA Stored Successfully!");
                    }
                }

                if (o == 2) {
                    System.out.println("The Records Stored=>");
                    for (int ii = 0; i <10; i++) 
                        System.out.print(r[ii] + "Roll number:");
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

        else if (uu != 569) {
            System.out.println("You Have Enter Incorrect Username!");
        }

        else if (pp != 123) {
            System.out.println("You Have Enter Incorrct Password!");
        }

    }
}
