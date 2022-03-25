import java.util.Scanner;

public class PlayerHuman extends Player {

    public PlayerHuman() {}
    public PlayerHuman(String name) {
        super(name);
    }

    public int guess() {
        System.out.print("Podaj liczbe:");
        return new Scanner(System.in).nextInt();
    }
}
