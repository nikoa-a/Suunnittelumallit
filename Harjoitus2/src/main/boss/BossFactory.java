package main.boss;

import main.Farmarit;
import main.Kengat;
import main.Lippis;
import main.TPaita;
import main.VaateFactory;

public class BossFactory implements VaateFactory {
    
    public Farmarit createFarmarit() {
        return new BossFarmarit();
    }

    public TPaita createTPaita() {
        return new BossTPaita();
    }

    public Kengat createKengat() {
        return new BossKengat();
    }

    public Lippis createLippis() {
        return new BossLippis();
    }
}
