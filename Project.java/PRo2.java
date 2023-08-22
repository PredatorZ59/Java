import java.util.Scanner;

class PRo2 {

    // CREATING THIS FUNCTION IN ORDER TO SHOW THE INSTRUCTIONS

    static void showInstructions(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //For easy way we had written the a.length, because we can access all the Strings using it. 

        //for (int i = 0; i < 6; i++) {System.out.println(a[i]);}
        //We can also use the 6, because we have 6 strings in String a[].
            
    }

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
            showInstructions(a);

            // System.out.println("2.View Records");
            // System.out.println("3.Search Records");
            // System.out.println("4.Update Records");
            // System.out.println("5.Result");
            // System.out.println("6.Exit");};

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

                    // CALLING THIS FUNCTION IN ORDER TO SHOW THE INSTRUCTIONS
                    showInstructions(a);

                    System.out.println("Enter the Option=");
                    ;

                }
            }

            if (o == 2) {
                System.out.println("The Records Stored=>");
                System.out.println("Roll number:");
                // CALLING THIS FUNCTION IN ORDER TO SHOW THE INSTRUCTIONS
                showInstructions(a);
            }

            if (o == 3) {
                System.out.println("Enter the roll number to search=");
                // CALLING THIS FUNCTION IN ORDER TO SHOW THE INSTRUCTIONS
                showInstructions(a);
            }

            if (o == 4) {
                System.out.println("Enter the roll number to update=");
                // CALLING THIS FUNCTION IN ORDER TO SHOW THE INSTRUCTIONS
                showInstructions(a);
            }

            if (o == 5) {
                // CALLING THIS FUNCTION IN ORDER TO SHOW THE INSTRUCTIONS
                showInstructions(a);
            }

            if (o == 6) {
                System.out.println("Session Ended!");
                // CALLING THIS FUNCTION IN ORDER TO SHOW THE INSTRUCTIONS
                showInstructions(a);

            }

        } else if (uu != 569) {
            System.out.println("You Have Enter Incorrect Username!");
        }

        else if (pp != 123) {
            System.out.println("You Have Enter Incorrct Password!");
        }

    }
}
