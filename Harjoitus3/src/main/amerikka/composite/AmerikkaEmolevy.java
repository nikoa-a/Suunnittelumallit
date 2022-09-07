package main.amerikka.composite;

import main.Laiteosa;
import main.composite.Emolevy;

public class AmerikkaEmolevy extends Emolevy {

    @Override
    public double hinta() {
        double yhteensa = 100;
        for (Laiteosa laiteosa : osat) {
            yhteensa += laiteosa.hinta();
        }
        return yhteensa;
    }

}
