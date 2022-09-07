package main.amerikka;

import main.LaiteFactory;
import main.amerikka.composite.AmerikkaEmolevy;
import main.amerikka.composite.AmerikkaKotelo;
import main.amerikka.leaf.AmerikkaMuistipiiri;
import main.amerikka.leaf.AmerikkaNaytonohjain;
import main.amerikka.leaf.AmerikkaProsessori;
import main.amerikka.leaf.AmerikkaTuuletin;
import main.amerikka.leaf.AmerikkaVerkkokortti;
import main.composite.Emolevy;
import main.composite.Kotelo;
import main.leaf.Muistipiiri;
import main.leaf.Naytonohjain;
import main.leaf.Prosessori;
import main.leaf.Tuuletin;
import main.leaf.Verkkokortti;

public class AmerikkaFactory implements LaiteFactory{

    public Kotelo createKotelo() {
        return new AmerikkaKotelo();
    }

    public Emolevy createEmolevy() {
        return new AmerikkaEmolevy();
    }

    public Muistipiiri createMuistipiiri() {
        return new AmerikkaMuistipiiri();
    }

    public Prosessori createProsessori() {
        return new AmerikkaProsessori();
    }

    public Verkkokortti createVerkkokortti() {
        return new AmerikkaVerkkokortti();
    }

    public Naytonohjain createNaytonohjain() {
        return new AmerikkaNaytonohjain();
    }

    public Tuuletin createTuuletin() {
        return new AmerikkaTuuletin();
    }

}
