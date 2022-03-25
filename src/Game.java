import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private List<Player> players = new ArrayList<Player>();
    Statistics stats;
    private Random random = new Random();

    public Game() {
        this.stats = new NullStatistics();
    }

    public Game(Statistics stats) {
        if(stats != null)
            this.stats = stats;
        else
            this.stats = new NullStatistics();
    }

    public void printPlayers(){
        players.forEach((player) -> {
            System.out.println(player.getName());
        });
    }

    public void removePlayer(String name){
        if(name != null) {
            players.removeIf(player -> player.getName().equals(name));
        }
    }

    public void addPlayer(Player player){
        if(player != null) {
            if(ifPlayerExists(player)){
                player.setName(player.getName() + random.nextInt(9));
                addPlayer(player);
            }else{
                players.add(player);
            }
        }
    }

    private boolean ifPlayerExists(Player player) {
        for(Player pl : players) {
            if(player.getName().equals(pl.getName())) {
                return true;
            }
        }
        return false;
    }

    public void play() {
        int guess, randomNumber;
        boolean repeat = true;

        do {
            randomNumber = random.nextInt(6) + 1;
            for(Player player : players) {
                guess = player.guess();
                System.out.println("Podana przez gracza " + player.getName()
                        + ": " + String.valueOf(guess));

                if(guess == randomNumber) {
                    repeat = false;
                    stats.andTheWinnerIs(player);
                    System.out.println("Wygrałeś");
                }
            }
            System.out.println("Wylosowana:" + String.valueOf(randomNumber));

            System.out.println("---------------------");
        }while(repeat);

    }

    public void printStatistics(){
        stats.print();
    }

}
