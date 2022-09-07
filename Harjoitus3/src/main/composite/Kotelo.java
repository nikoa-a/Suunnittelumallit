package main.composite;

import java.util.ArrayList;
import java.util.List;
import main.Laiteosa;

public abstract class Kotelo implements Laiteosa {

    protected List<Laiteosa> osat;

    public Kotelo() {
        this.osat = new ArrayList<>();
    }
    
    public void add(Laiteosa osa) {
        this.osat.add(osa);
    }

    public void remove(Laiteosa osa) {
        this.osat.remove(osa);
    }

}
