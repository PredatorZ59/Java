class Laptop{
    static int OS(){System.out.println("Windows"); return 0;}
}

class PC extends Laptop{
    static int OS(){System.out.println("Linux"); return 0;}
}
public class PG110 {
    public static void main(String[] args) {
        Laptop l=new Laptop();
        PC p=new PC();
        l.OS();
        p.OS();
    }
}
