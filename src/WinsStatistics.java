
import java.util.HashMap;
import java.util.Map;

public class WinsStatistics implements Statistics {
    private Map<Player, Integer> scores = new HashMap();

    public void andTheWinnerIs(Player player) {
        if(player != null) {
            Integer score = this.scores.getOrDefault(player, 1);
            score += 1;
            this.scores.put(player, score);
        }
    }

    public void print() {
        scores.forEach((key, value) ->{
            System.out.println("Gracz: " + key.getName() + " | Wygranych: " + value);
        });
    }

    public void clear(){
        scores.clear();
    }
}
