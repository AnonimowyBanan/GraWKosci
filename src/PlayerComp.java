import java.util.Scanner;

public class PlayerComp extends Player {

    public PlayerComp() {}
    public PlayerComp(String name) {
        super(name);
    }

    public int guess(){
        return brain.nextInt(6) + 1;
    }
}
