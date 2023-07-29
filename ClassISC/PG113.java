abstract class Game {
    abstract int play();
}

class minecraft extends Game {
    int play() {
        return 1;
    }
}

class farcry extends Game {
    int play() {
        return 2;
    }
}

public class PG113 {
    public static void main(String[] args) {
        Game g;
        g = new minecraft();
        System.out.println("Playing Minecraft... " + g.play() + " Rank");
        g = new farcry();
        System.out.println("Playing FarCry... " + g.play() + " Rank");

    }
}
