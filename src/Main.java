public class Main {

    public static void main(String[] args) {
        Game game = new Game(new WinsStatistics());
        game.addPlayer(new PlayerComp("Player"));
        game.addPlayer(new PlayerComp("Player1"));
        game.addPlayer(new PlayerComp("Player2"));

        for (int i=0; i<10; i++)
            game.play();

        game.printStatistics();
    }
}
