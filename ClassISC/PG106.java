class student{
    void study(){System.out.println("Studying...");}
}

class teacher extends student{
    void teach(){System.out.println("Teaching...");}
}
public class PG106 {
    public static void main(String[] args) {
      teacher t=new teacher();
      t.study();
      t.teach();  
    }
}
