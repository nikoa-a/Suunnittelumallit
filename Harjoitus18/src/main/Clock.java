package main;

public class Clock implements Cloneable {

    private Time time;

    public Clock(Time time) {
        this.time = time;
    }

    public void move() {
        time.move();
    }

    public Clock clone() {

        Clock c = null;
        try {
            c = (Clock)super.clone();
            c.time = (Time)time.clone();
        } catch (CloneNotSupportedException e) {}
        
        return c;

    }

    public String toString() {
        return time.toString();
    }
    
}
