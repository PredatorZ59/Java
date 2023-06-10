import java.util.Scanner;

public class PG80 {
    
    public static void main(String[] args) {
        Scanner ti=new Scanner(System.in);
        System.out.println("Enter The Character=");
        char a=ti.next().charAt(0);

        switch(a)
        {
            case 'a':
                System.out.println("This is a vowel:A.");
                break;

            case 'e':
                System.out.println("This is a vowel:E.");
                break;
            case 'i':
                System.out.println("This is a vowel:I.");
                break;

            case 'o':
                System.out.println("This is a vowel:O.");
                break;

            case 'u':
                System.out.println("This is a vowel:U.");
                break;
               
            case 'A':
                System.out.println("This is a vowel:A.");
                break;

            case 'E':
                System.out.println("This is a vowel:E.");
                break;
            case 'I':
                System.out.println("This is a vowel:I.");
                break;

            case 'O':
                System.out.println("This is a vowel:O.");
                break;

            case 'U':
                System.out.println("This is a vowel:U.");
                break;

                default:
                System.out.println("Error-The Character Entered is a Consonant OR 'Invalid' ");

        }

    }
}
