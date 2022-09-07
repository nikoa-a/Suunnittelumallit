package main.amerikka.composite;

import main.Laiteosa;
import main.composite.Kotelo;

public class AmerikkaKotelo extends Kotelo {

    @Override
    public double hinta() {
        double yhteensa = 80.49;
        for (Laiteosa laiteosa : osat) {
            yhteensa += laiteosa.hinta();
        }
        return yhteensa;
    }

}
