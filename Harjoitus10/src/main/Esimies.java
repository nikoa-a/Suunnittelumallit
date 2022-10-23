package main;

public class Esimies extends Handler {

    private final double ALLOWABLE = 2;

    public void processRequest(Palkankorotus request) {
        if (request.getPercent() <= ALLOWABLE) {
            System.out.println("Esimies hyväksyy palkankorotuksen: " + request.getPercent() + " %");
        } else {
            super.processRequest(request);
        }
    }
    
}
