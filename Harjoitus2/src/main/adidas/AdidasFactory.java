package main.adidas;

import main.Farmarit;
import main.Kengat;
import main.Lippis;
import main.TPaita;
import main.VaateFactory;

public class AdidasFactory implements VaateFactory {

    public Farmarit createFarmarit() {
        return new AdidasFarmarit();
    }

    public TPaita createTPaita() {
        return new AdidasTPaita();
    }

    public Kengat createKengat() {
        return new AdidasKengat();
    }

    public Lippis createLippis() {
        return new AdidasLippis();
    }

}
