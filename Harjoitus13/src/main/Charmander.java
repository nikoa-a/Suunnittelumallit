package main;

public class Charmander extends State {

    private static Charmander INSTANCE = null;
    ConcreteVisitor visitor = new ConcreteVisitor();

    private Charmander() {}

    public static Charmander getInstance() {
        if (INSTANCE == null){
            INSTANCE = new Charmander();
        }
        return INSTANCE;
    }

    public void attack(Pokemon p) {
        p.addPoints(3);
        if (visitor.visit(this, p.getPoints())) {
            changeState(p, Charmeleon.getInstance());
            System.out.println("Tila muuttunut: Charmander -> Charmeleon");
        }
    }

    public void defend(Pokemon p) {
        p.addPoints(2);
        if (visitor.visit(this, p.getPoints())) {
            changeState(p, Charmeleon.getInstance());
            System.out.println("Tila muuttunut: Charmander -> Charmeleon");
        }
    }

    public void run(Pokemon p) {
        p.addPoints(-1);
    }
 
}
