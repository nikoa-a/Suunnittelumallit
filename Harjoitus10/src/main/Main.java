package main;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Esimies esimies = new Esimies();
        Paallikko paallikko = new Paallikko();
        Toimitusjohtaja tj = new Toimitusjohtaja();

        esimies.setSuccessor(paallikko);
        paallikko.setSuccessor(tj);

        esimies.processRequest(new Palkankorotus(3));
    }

}
