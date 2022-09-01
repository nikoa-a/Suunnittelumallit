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

    public Jasper createJasper(JasperFactory jasuFactory){
        return null;
    }

    public String toString() {
        return "Mulla on päällä: " + farmarit + tPaita + lippis + kengat;
    }

}
