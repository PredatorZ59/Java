abstract class Game{
    abstract void play();
}

class minecraft extends Game{
    void play(){System.out.println("Playing...");}
}

public class PG111 {
    public static void main(String[] args) {
    Game g=new minecraft();     
    g.play();
    }
 }   

