class offlineGame{
    void offline(){System.out.println("NO Internet...");}
}

class onlineGame extends offlineGame{
    void online(){System.out.println("Internet...");}
}

public class PG105 {
    public static void main(String[] args) {
        onlineGame o=new onlineGame();
        o.offline();
        o.online();
    }
    
}
