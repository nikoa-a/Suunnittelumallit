package main.kiina.composite;

import main.Laiteosa;
import main.composite.Emolevy;

public class KiinaEmolevy extends Emolevy {

    @Override
    public double hinta() {
        double yhteensa = 50;
        for (Laiteosa laiteosa : osat) {
            yhteensa += laiteosa.hinta();
        }
        return yhteensa;
    }

}
