package MYprojects;
import java.time.Year;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class T1 {
    
    public static void main(String[] args) {
        Scanner ti=new Scanner(System.in);
        System.out.println("PLXA CLOUD");
        System.out.println("Want To LOGIN? Enter 'y' To LOGIN, If not then Enter 'n' To Create Account.");
        char a=ti.next().charAt(0);
        char b='y';
        String c="Admin";
        int d= 12345678;
        char zx='n';

    
          if(zx==a)
           {
            System.out.println("Feature is not available right Now!Contact The admin To know More.");
           }

          if(b==a)
           {
            System.out.println("**Welcome!To PLXA LOGIN**");
            System.out.println("Enter The PLXA ID.");
            String inp=ti.next();

             if(inp==c){
                System.out.println("The User ID is Valid!.");

             }

             else
                System.out.println("The User ID is Valid!.");
             

             System.out.println("Enter The Password.");
             int inpu=ti.nextInt();
                   
             if(inpu==d){
                System.out.println("The Password is Correct!.");
                System.out.println("Login Successfull!.");
             }

             else{
                System.out.println("The Password is Incorrect!Please Enter The Correct Password!.");
             }

             if(inpu==d){
                System.out.println("Files list:");
                System.out.println("Name=Game.mp4 Size=234MB Date=12/5/2023 Time=15:32 pm Status=Done");
             }


           }

        
        
    }
}
