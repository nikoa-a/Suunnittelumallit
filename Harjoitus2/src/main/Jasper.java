package main;
public class Jasper {

    public Farmarit farmarit;
    public TPaita tPaita;
    public Lippis lippis;
    public Kengat kengat;

    public Jasper(Farmarit farmarit, TPaita tPaita, Lippis lippis, Kengat kengat) {
        this.farmarit = farmarit;
        this.tPaita = tPaita;
        this.lippis = lippis;
        this.kengat = kengat;
    }

    public static Jasper createJasper(VaateFactory vaateTehdas) {
        Farmarit f = vaateTehdas.createFarmarit();
        TPaita t = vaateTehdas.createTPaita();
        Lippis l = vaateTehdas.createLippis();
        Kengat k = vaateTehdas.createKengat();
        return new Jasper(f, t, l, k);
    }

    public String toString() {
        return "Mulla on päällä: " + farmarit + tPaita + lippis + kengat;
    }

}
