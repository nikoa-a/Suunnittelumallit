package main;

public class Pokemon {

    private State state;
    private int points;

    //Aluksi ollaan "Charmander" -tilassa
    public Pokemon() {
        state = Charmander.getInstance();
    }

    public int getPoints() {
        return points;
    }

    protected void addPoints(int points) {
        this.points = this.points + points;
    }

    public void attack() {
        state.attack(this);
    }

    public void defend() {
        state.defend(this);
    }

    public void run() {
        state.run(this);
    }

    protected void changeState (State s) {
        state = s;
    }

}