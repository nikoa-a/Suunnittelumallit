package main.kiina.composite;

import main.Laiteosa;
import main.composite.Kotelo;

public class KiinaKotelo extends Kotelo{

    @Override
    public double hinta() {
        double yhteensa = 20;
        for (Laiteosa laiteosa : osat) {
            yhteensa += laiteosa.hinta();
        }
        return yhteensa;
    }

}
