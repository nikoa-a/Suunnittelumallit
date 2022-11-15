package main;

public abstract class State {

    public void attack(Pokemon p) {};

    public void defend(Pokemon p) {};

    public void run(Pokemon p) {};

    public void changeState(Pokemon p, State s) {
        p.changeState(s);
    }

}
