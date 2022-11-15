package main;

public class Charmeleon extends State {

    private static Charmeleon INSTANCE = null;
    ConcreteVisitor visitor = new ConcreteVisitor();

    private Charmeleon() {}

    public static Charmeleon getInstance() {
        if (INSTANCE == null){
            INSTANCE = new Charmeleon();
        }
        return INSTANCE;
    }

    public void attack(Pokemon p) {
        p.addPoints(2);
        if (visitor.visit(this, p.getPoints())) {
            changeState(p, Charizard.getInstance());
            System.out.println("Tila muuttunut: Charmeleon -> Charizard");
        }
    }

    public void defend(Pokemon p) {
        p.addPoints(1);
        if (visitor.visit(this, p.getPoints())) {
            changeState(p, Charizard.getInstance());
            System.out.println("Tila muuttunut: Charmeleon -> Charizard");
        }
    }

    public void run(Pokemon p) {
        p.addPoints(-2);
    }
    
}
