package main;

public class Toimitusjohtaja extends Handler {

    private final double ALLOWABLE = 9;

    public void processRequest(Palkankorotus request) {
        if (request.getPercent() <= ALLOWABLE) {
            System.out.println("Toimitusjohtaja hyväksyy palkankorotuksen: " + request.getPercent() + " %");
        } else {
            System.out.println("Palkankorotusta ei hyväksytty.");
        }
    }
    
}
