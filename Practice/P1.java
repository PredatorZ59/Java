package Practice;

public class P1 {
    public static void main(String[] args) {
        
        String p1="Tirthesh";
        String p2="Tirthesh";
        String p3="Sarvesh";
        System.out.println(p1.equals(p2));//true // OR (p1==p2);
        System.out.println(p1.equals(p1));//true // OR (p2==p3);
        System.out.println(p1.equals(p3));//false // OR (p1==p3);
    }
}
