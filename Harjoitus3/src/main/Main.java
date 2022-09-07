package main;

import main.amerikka.AmerikkaFactory;
import main.composite.Emolevy;
import main.composite.Kotelo;
import main.kiina.KiinaFactory;

public class Main {

    public static void main(String[] args) throws Exception {
        LaiteFactory kiinaFactory = new KiinaFactory();
        LaiteFactory amerikkaFactory = new AmerikkaFactory();

        Kotelo kotelo = kiinaFactory.createKotelo();
        Emolevy emolevy = kiinaFactory.createEmolevy();

        Laiteosa muistipiiri = kiinaFactory.createMuistipiiri();
        Laiteosa prosessori = amerikkaFactory.createProsessori();
        Laiteosa verkkokortti = kiinaFactory.createVerkkokortti();
        Laiteosa naytonohjain = kiinaFactory.createNaytonohjain();
        emolevy.add(muistipiiri);
        emolevy.add(prosessori);
        emolevy.add(verkkokortti);
        emolevy.add(naytonohjain);
        
        // Tuulettimet halvempia amerikassa
        Laiteosa tuuletin = amerikkaFactory.createTuuletin();
        kotelo.add(emolevy);
        kotelo.add(tuuletin);
        kotelo.add(tuuletin);
        kotelo.add(tuuletin);

        System.out.println(kotelo.hinta());
        
        // Ei tarpeeksi halpoja
        kotelo.remove(tuuletin);
        System.out.println(kotelo.hinta());
    }
    
}
