class student{
    void study(){System.out.println("Studying...");}
}

class teacher extends student{
    void teach(){System.out.println("Teaching...");}
}

class parent extends teacher{
    void help(){System.out.println("Helping...");}
}

public class PG107 {
    public static void main(String[] args) {
        parent p=new parent();
        p.study();
        p.teach();
        p.help();
    }
    
}
