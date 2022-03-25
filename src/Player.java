import java.util.Random;

public abstract class Player {
    public Random brain = new Random();
    private String name = "NoName";
    public Player() { }
    public Player(String name) {
        this.setName(name);
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String name) {
        if (name != null && !name.isEmpty() && name.matches("^[a-zA-Z0-9.\\-_]{3,}$"))
            this.name = name;
        else {
            throw new IllegalArgumentException("Nieprawidlowe imie");
        }
    }

    public abstract int guess();
}
