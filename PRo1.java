import java.util.Scanner;

class PRo1 {

    static void Instructions(String[] a) {
        for (int i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }
    }

    public static int roll;
    public static String name;
    public static String add;
    public static String phone;
    public static String sclass;
    public static String marks;

    public static void main(String[] args) {
        Scanner ti = new Scanner(System.in);
        System.out.println("Welcome to ***Predator*** Record Storage System!");

        System.out.println("Enter Usename=");
        int uu = ti.nextInt();
        System.out.println("Enter Password=");
        int pp = ti.nextInt();

        if (uu == 569 && pp == 123) {
            System.out.println("Welcome Predator!");

            String a[] = { "1.Add Records", "2.View Records", "3.Search Records", "4.Update Records", "5.Result",
                    "6.Exit" };
            Instructions(a);

            System.out.println("Enter the Option=");
            int o = ti.nextInt();

            if (o == 1) {
                System.out.println("How many Record do you want to add?");
                int n = ti.nextInt();
                int num;

                for (num = 0; num != n; num++) {

                    System.out.println("Enter Student Roll Number=");
                    int roll = ti.nextInt();

                    System.out.println("Enter Student Name=");
                    String name = ti.next();

                    System.out.println("Enter Student Address=");
                    String add = ti.next();

                    System.out.println("Enter Student phone Number=");
                    String phone = ti.next();

                    System.out.println("Enter Student Class=");
                    int sclass = ti.nextInt();

                    System.out.println("Enter Student Marks=");
                    int marks = ti.nextInt();

                    System.out.println("DATA Stored Successfully!");

                    Instructions(a);


                }
            }

            if (o == 2) {
                System.out.println("The Records Stored=>");
                System.out.println("Roll number:"+roll);
                Instructions(a);
            }

            if (o == 3) {
                System.out.println("Enter the roll number to search=");
                Instructions(a);
            }

            if (o == 4) {
                System.out.println("Enter the roll number to update=");
                Instructions(a);
            }

            if (o == 5) {
                Instructions(a);
            }

            if (o == 6) {
                System.out.println("Session Ended!");
                Instructions(a);

            }

        } else if (uu != 569) {
            System.out.println("You Have Enter Incorrect Username!");
        }

        else if (pp != 123) {
            System.out.println("You Have Enter Incorrct Password!");
        }

    }
}
