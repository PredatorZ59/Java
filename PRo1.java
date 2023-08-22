import java.util.Scanner;

public class PRo1 {
    public int roll;
    public String name;
    public String add;
    public String phone;
    public int sclass;
    public int marks;
    public static int o;
    public static int ii;
    public static int i;
    public static int n;
    public static int rs;

    public static void main(String[] args) {

        Scanner ti = new Scanner(System.in);
        int i;
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
                    n = ti.nextInt();

                    for (i = 0; i < n; i++) {
                        p[i] = new PRo1();
                        System.out.println("Enter Student Roll Number=");
                        p[i].roll = ti.nextInt();

                        System.out.println("Enter Student Name=");
                        p[i].name = ti.next();

                        System.out.println("Enter Student Address=");
                        p[i].add = ti.next();

                        System.out.println("Enter Student phone Number=");
                        p[i].phone = ti.next();

                        System.out.println("Enter Student Class=");
                        p[i].sclass = ti.nextInt();

                        System.out.println("Enter Student Marks=");
                        p[i].marks = ti.nextInt();

                        System.out.println("DATA Stored Successfully!");

                    }
                }

                if (o == 2) {
                    System.out.println("The Records Stored=>");
                    System.out.println(
                            "Roll Number \t" + "Name \t" + "Address \t" + "Phone Number \t" + "Class \t" + "Marks \t");
                    for (i = 0; i < n; i++) {
                        System.out.println(p[i].roll + "\t" + p[i].name + "\t" + p[i].add + "\t" + p[i].phone + "\t"
                                + p[i].sclass + "\t" + p[i].marks + "\t");
                    }
                }

                if (o == 3) {
                    System.out.println("Enter the roll number to search=");
                    rs = ti.nextInt();
                    for (i = 0; i < n; i++) {
                        if (rs == p[i].roll) {
                            System.out.println("Roll Number \t" + "Name \t" + "Address \t" + "Phone Number \t"
                                    + "Class \t" + "Marks \t");

                            System.out.println(p[i].roll + "\t" + p[i].name + "\t" + p[i].add + "\t" + p[i].phone
                                    + "\t" + p[i].sclass + "\t" + p[i].marks + "\t");
                        }
                    }
                }

                if (o == 4) {
                    System.out.println("Enter the roll number to update=");
                    rs = ti.nextInt();
                    for (i = 0; i < 1; i++) {
                        if (rs == p[i].roll) {
                            System.out.println("Roll Number \t" + "Name \t" + "Address \t" + "Phone Number \t"
                                    + "Class \t" + "Marks \t");

                            System.out.println(p[i].roll + "\t" + p[i].name + "\t" + p[i].add + "\t" + p[i].phone
                                    + "\t" + p[i].sclass + "\t" + p[i].marks + "\t");

                            System.out.println("1.Update Roll number");
                            System.out.println("2.Update Name");
                            System.out.println("3.Update Address");
                            System.out.println("4.Update Phone number");
                            System.out.println("5.Update Class");
                            System.out.println("6.Update Marks");
                            System.out.println("Enter the option=");
                            int op = ti.nextInt();

                            if (op == 1) {
                                for (i = 0; i < 1; i++) {
                                    System.out.println("Enter Student Roll Number=");
                                    p[i].roll = ti.nextInt();
                                    System.out.println("DATA Stored Successfully!");
                                }
                            }

                            if (op == 2) {
                                for (i = 0; i < 1; i++) {
                                    System.out.println("Enter Student Name=");
                                    p[i].name = ti.next();
                                    System.out.println("DATA Stored Successfully!");
                                }
                            }

                            if (op == 3) {
                                for (i = 0; i < 1; i++) {
                                    System.out.println("Enter Student Address=");
                                    p[i].add = ti.next();
                                    System.out.println("DATA Stored Successfully!");
                                }
                            }

                            if (op == 4) {
                                for (i = 0; i < 1; i++) {
                                    System.out.println("Enter Student phone Number=");
                                    p[i].phone = ti.next();
                                    System.out.println("DATA Stored Successfully!");
                                }
                            }

                            if (op == 5) {
                                for (i = 0; i < 1; i++) {
                                    System.out.println("Enter Student Class=");
                                    p[i].sclass = ti.nextInt();
                                    System.out.println("DATA Stored Successfully!");
                                }
                            }

                            if (op == 6) {
                                for (i = 0; i < 1; i++) {
                                    System.out.println("Enter Student Marks=");
                                    p[i].marks = ti.nextInt();
                                    System.out.println("DATA Stored Successfully!");
                                }
                            }
                        }
                    }
                }
                if (o == 5) {
                    for (i = 0; i < n; i++) {
                        if (p[i].marks > 27) {
                            System.out.println("*****Pass*****");
                            System.out.println("Roll Number \t" + "Name \t" + "Address \t" + "Phone Number \t"
                                    + "Class \t" + "Marks \t");

                            System.out.println(p[i].roll + "\t" + p[i].name + "\t" + p[i].add + "\t" + p[i].phone
                                    + "\t" + p[i].sclass + "\t" + p[i].marks + "\t");
                        }

                        if (p[i].marks < 28) {
                            System.out.println("*****Fail*****");
                            System.out.println("Roll Number \t" + "Name \t" + "Address \t" + "Phone Number \t"
                                    + "Class \t" + "Marks \t");

                            System.out.println(p[i].roll + "\t" + p[i].name + "\t" + p[i].add + "\t" + p[i].phone
                                    + "\t" + p[i].sclass + "\t" + p[i].marks + "\t");
                        }
                    }
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
