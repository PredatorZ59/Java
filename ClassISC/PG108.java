class student{
    void study(){System.out.println("Studying...");}
}

class teacher extends student{
    void teach(){System.out.println("Teaching...");}
}

class parent extends student{
    void help(){System.out.println("Helping...");}
}

public class PG108 {
    public static void main(String[] args) {
        parent p=new parent();
        p.study();
        //p.teach(); 
        // will not work because parent class don't knows teacher class
        p.help();

    }
}
