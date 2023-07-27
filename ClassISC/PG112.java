abstract class Game{
    abstract void play();
}

class minecraft extends Game{
    void play(){System.out.println("Playing Minecraft...");}
}

class farcry extends Game{
    void play(){System.out.println("Playing FarCry...");}
}

public class PG112 {
    public static void main(String[] args) {
        Game g=new farcry();
        g.play();

    }
}
