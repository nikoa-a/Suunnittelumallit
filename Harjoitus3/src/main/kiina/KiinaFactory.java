package main.kiina;

import main.LaiteFactory;
import main.composite.Emolevy;
import main.composite.Kotelo;
import main.kiina.composite.KiinaEmolevy;
import main.kiina.composite.KiinaKotelo;
import main.kiina.leaf.KiinaMuistipiiri;
import main.kiina.leaf.KiinaNaytonohjain;
import main.kiina.leaf.KiinaProsessori;
import main.kiina.leaf.KiinaTuuletin;
import main.kiina.leaf.KiinaVerkkokortti;
import main.leaf.Muistipiiri;
import main.leaf.Naytonohjain;
import main.leaf.Prosessori;
import main.leaf.Tuuletin;
import main.leaf.Verkkokortti;

public class KiinaFactory implements LaiteFactory{

    public Kotelo createKotelo() {
        return new KiinaKotelo();
    }

    public Emolevy createEmolevy() {
        return new KiinaEmolevy();
    }

    public Muistipiiri createMuistipiiri() {
        return new KiinaMuistipiiri();
    }

    public Prosessori createProsessori() {
        return new KiinaProsessori();
    }

    public Verkkokortti createVerkkokortti() {
        return new KiinaVerkkokortti();
    }

    public Naytonohjain createNaytonohjain() {
        return new KiinaNaytonohjain();
    }

    public Tuuletin createTuuletin() {
        return new KiinaTuuletin();
    }

}
