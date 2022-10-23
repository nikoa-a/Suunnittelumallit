package main;

public abstract class Handler {

    private Handler successor;
    
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void processRequest(Palkankorotus request){
        if (successor != null)
            successor.processRequest(request);
    }
    
}
