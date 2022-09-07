package main.composite;
import java.util.ArrayList;
import java.util.List;

import main.Laiteosa;

public abstract class Emolevy implements Laiteosa {

    protected List<Laiteosa> osat;
    
    public Emolevy() {
        this.osat = new ArrayList<>();
    }

    public void add(Laiteosa osa) {
        this.osat.add(osa);
    }

    
}
