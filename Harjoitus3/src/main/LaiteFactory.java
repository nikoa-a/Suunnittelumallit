package main;

import main.composite.Emolevy;
import main.composite.Kotelo;
import main.leaf.Muistipiiri;
import main.leaf.Naytonohjain;
import main.leaf.Prosessori;
import main.leaf.Tuuletin;
import main.leaf.Verkkokortti;

public interface LaiteFactory {

    public Kotelo createKotelo();

    public Emolevy createEmolevy();

    public Muistipiiri createMuistipiiri();

    public Prosessori createProsessori();

    public Verkkokortti createVerkkokortti();

    public Naytonohjain createNaytonohjain();

    public Tuuletin createTuuletin();

}
