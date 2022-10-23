package main;

public class Paallikko extends Handler {
    
    private final double ALLOWABLE = 5;

    public void processRequest(Palkankorotus request) {
        if (request.getPercent() <= ALLOWABLE) {
            System.out.println("Päällikkö hyväksyy palkankorotuksen: " + request.getPercent() + " %");
        } else {
            super.processRequest(request);
        }
    }

}
