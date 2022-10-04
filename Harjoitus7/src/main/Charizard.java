package main;

public class Charizard extends State {

    private static Charizard INSTANCE = null;

    private Charizard() {}

    public static Charizard getInstance() {
        if (INSTANCE == null){
            INSTANCE = new Charizard();
        }
        return INSTANCE;
    }

    public void attack(Pokemon p) {
        p.addPoints(2);
    }

    public void defend(Pokemon p) {
        p.addPoints(1);
    }

    public void run(Pokemon p) {
        p.addPoints(-3);
    }
    
}
