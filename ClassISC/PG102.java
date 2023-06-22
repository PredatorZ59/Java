import java.util.Scanner;
public class PG102 {
    
    static void Odd_Even(int a){
      if(a%2==0){
        System.out.println(a+" is Even.");
      }
      else{
        System.out.println(a+" is Odd.");
      }
      
    }

    public static void main(String[] args) {
        Scanner ti=new Scanner(System.in);
        System.out.println("Enter th Number=");
        int a=ti.nextInt();
        Odd_Even(a);
    }
    
}
