import java.util.Scanner;

import javax.swing.text.View;
 class PRo1 {
    public static void main(String[] args) {
        Scanner ti=new Scanner(System.in);
        System.out.println("Welcome to Predator Record Storage System!");

        System.out.println("Enter Usename="); 
        int uu=ti.nextInt();
        System.out.println("Enter Password=");
        int pp=ti.nextInt();

        if(uu==569 && pp==123){
            System.out.println("Welcome Predator!");

            System.out.println("1.Add Records");
            System.out.println("2.View Records");
            System.out.println("3.Search Records");
            System.out.println("4.Update Records");
            System.out.println("5.Result");
            System.out.println("6.Exit");

            System.out.println("Enter the Option=");
            int o=ti.nextInt();

            if(o==1){
                System.out.println("How many Record do you want to add?");
            }

            if(o==2){
                System.out.println("Enter your Choice=");
            }

            if(o==3){
                System.out.println("Enter the roll number to search=");
            }

            if(o==4){
                System.out.println("Enter the roll number to update=");
            }

            if(o==5){

            }

            if(o==6){
                System.out.println("Session Ended!");
        
        }

        else if(uu!=569){
            System.out.println("You Have Enter Incorrect Username");
        }

        else if (pp!=123){
            System.out.println("You Have Enter Incorrct Password!");
        }
       
    }
}


